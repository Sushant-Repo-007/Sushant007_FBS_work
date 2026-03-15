class Flower {

	String name;
	String color;
	String fragrance;
	int petalCount;
	String isSeasonal; // class members here 
	String lifeSpan;
	String hasThorns;

	static int count = 0;

	Flower(String name, String color, String fragrance, int petalCount, String isSeasonal, String lifeSpan,
			String hasThorns) {

		this.name = name;
		this.color = color;
		this.fragrance = fragrance;
		this.petalCount = petalCount;
		this.isSeasonal = isSeasonal;
		this.lifeSpan = lifeSpan;
		this.hasThorns = hasThorns;

		count++; // increase object count
	}

	void bloom() {
        System.out.println("Flower is blooming");
    } // common behaviour here  
	
	
		
	
	
	void display() {
		System.out.println("Flower Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Fragrance: " + fragrance);
		System.out.println("Petal Count: " + petalCount);
		System.out.println("Seasonal: " + isSeasonal);
		System.out.println("Life Span: " + lifeSpan);
		System.out.println("Has Thorns: " + hasThorns);
	}

	static int getCount() {
		return count;
	}
}

// -------------------- Rose --------------------

class Rose extends Flower {

	int thornCount;
	String varietyType; // extra attributes here 

	Rose(String name, String color, String fragrance, int petalCount, String isSeasonal, String lifeSpan,
			String hasThorns, int thornCount, String varietyType) {

		super(name, color, fragrance, petalCount, isSeasonal, lifeSpan, hasThorns);

		this.thornCount = thornCount;
		this.varietyType = varietyType;
	}

	
	void bloom() {
        System.out.println("Flower is blooming  with red petals ");
    } // common behaviour here  but implemented differently 
	
	
	
	void display() {
		super.display();
		System.out.println("Thorn Count: " + thornCount);
		System.out.println("Variety Type: " + varietyType);
	}
}

// -------------------- SunFlower --------------------

class SunFlower extends Flower { // is a relationship   here 

	int seedCount;
	int height;  // extra attributs here 

	SunFlower(String name, String color, String fragrance, int petalCount, String isSeasonal, String lifeSpan,
			String hasThorns, int seedCount, int height) {

		super(name, color, fragrance, petalCount, isSeasonal, lifeSpan, hasThorns);

		this.seedCount = seedCount;
		this.height = height;
	}
	

	void bloom() {
        System.out.println("Flower is blooming  with Yellow  petals ");
    } //// common behaviour here   but implemented differently 
	
	

	void display() {
		super.display();
		System.out.println("Seed Count: " + seedCount);
		System.out.println("Height: " + height + " cm");
	}
}

// -------------------- Main Class --------------------

public class TestFlower {

	public static void main(String[] args) {

		Flower f1 = new Flower("Lotus", "Pink", "Mild", 20, "Yes", "Moderate", "No");

		System.out.println("Flower Details:");
		f1.display();
		
		f1.bloom();
		

		System.out.println("--------------------------------");

		 f1 = new Rose("Black Rose", "Black", "Strong", 30, "Yes", "Long", "Yes", 10, "Hybrid");

		System.out.println("Rose Details:");
		f1.display();
		
		f1.bloom();

		System.out.println("--------------------------------");

		f1 = new SunFlower("Sunflower", "Yellow", "Mild", 25, "No", "Short", "No", 200, 180);

		System.out.println("Sunflower Details:");
		f1.display();
		
		f1.bloom();

		System.out.println("--------------------------------");
		System.out.println("Total Flower Objects Created: " + Flower.getCount());
	}
}