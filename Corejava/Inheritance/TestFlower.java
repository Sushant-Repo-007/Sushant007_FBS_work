class Flower {

	String name;
	String color;
	String fragrance;
	int petalCount;
	String isSeasonal;
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
	String varietyType;

	Rose(String name, String color, String fragrance, int petalCount, String isSeasonal, String lifeSpan,
			String hasThorns, int thornCount, String varietyType) {

		super(name, color, fragrance, petalCount, isSeasonal, lifeSpan, hasThorns);

		this.thornCount = thornCount;
		this.varietyType = varietyType;
	}

	void display() {
		super.display();
		System.out.println("Thorn Count: " + thornCount);
		System.out.println("Variety Type: " + varietyType);
	}
}

// -------------------- SunFlower --------------------

class SunFlower extends Flower {

	int seedCount;
	int height;

	SunFlower(String name, String color, String fragrance, int petalCount, String isSeasonal, String lifeSpan,
			String hasThorns, int seedCount, int height) {

		super(name, color, fragrance, petalCount, isSeasonal, lifeSpan, hasThorns);

		this.seedCount = seedCount;
		this.height = height;
	}

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

		System.out.println("--------------------------------");

		Rose r1 = new Rose("Black Rose", "Black", "Strong", 30, "Yes", "Long", "Yes", 10, "Hybrid");

		System.out.println("Rose Details:");
		r1.display();

		System.out.println("--------------------------------");

		SunFlower s1 = new SunFlower("Sunflower", "Yellow", "Mild", 25, "No", "Short", "No", 200, 180);

		System.out.println("Sunflower Details:");
		s1.display();

		System.out.println("--------------------------------");
		System.out.println("Total Flower Objects Created: " + Flower.getCount());
	}
}