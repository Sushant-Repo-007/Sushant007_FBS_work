class Bottle // base class here // structure here state ,Behaviour identity ,Responsibility
{
	int capacity; // class members here
	String material;
	String Color;
	String IsReusable;
	String Brandname;
	static int Count = 0; // counter here

	int getCapacity() {
		return capacity;
	}

	void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	String getMaterial() {
		return material;
	}

	void setMaterial(String material) {
		this.material = material;
	}

	String getColor() {
		return Color;
	}

	void setColor(String color) {
		Color = color;
	}

	String getIsReusable() {
		return IsReusable;
	}

	void setIsReusable(String isReusable) {
		IsReusable = isReusable;
	}

	String getBrandname() {
		return Brandname;
	}

	void setBrandname(String brandname) {
		Brandname = brandname;
	}

	static int getCount() {
		return Count;
	}

	static void setCount(int count) {
		Count = count;
	}

	Bottle(int capacity, String material, String color, String isReusable, String brandname) //

	{
		this.capacity = capacity;
		this.material = material;
		Color = color;
		IsReusable = isReusable;
		Brandname = brandname;
	}

	void display() // Responsibility here
	{
		System.out.println("The Material is :" + this.material);
		System.out.println("The Capacity is :" + this.capacity);
		System.out.println("The Color is:" + this.Color);
		System.out.println("The Reusable is:" + this.IsReusable);
		System.out.println("The Brandname is:" + this.Brandname);
	}

} // class Bottle ends here

class WaterBottle extends Bottle {
	String Isinsulated; // class members here
	double TemperatureRetentionHours;
	String HasStraw;

	WaterBottle(int capacity, String material, String color, String isReusable, String brandname, String isinsulated,
			double temperatureRetentionHours, String hasStraw) // constructor here

	{
		super(capacity, material, color, isReusable, brandname);
		Isinsulated = isinsulated;
		TemperatureRetentionHours = temperatureRetentionHours;
		HasStraw = hasStraw;
	}

	void display() {
		super.display();

		System.out.println("The Water Bottle is Insulated :" + this.Isinsulated);
		System.out.println("The Tempearature it can hold is:" + this.TemperatureRetentionHours);
		System.out.println("The Water Bottle has Straw :" + this.HasStraw);

	}

}// class water bottle ends here

class SportsBottle extends Bottle // derived class here
{
	String HasSipper;
	String isLeakProof;
	String gripType; // class members here

	SportsBottle(int capacity, String material, String color, String isReusable, String brandname, String hasSipper,
			String isLeakProof, String gripType)

	{
		super(capacity, material, color, isReusable, brandname);
		HasSipper = hasSipper;
		this.isLeakProof = isLeakProof;
		this.gripType = gripType;
	}

	void display() // responsibility here
	{
		super.display();
		System.out.println("The SportsBottle has Sipper:" + this.HasSipper);
		System.out.println("The SportsBottle is Leakproof:" + this.isLeakProof);
		System.out.println("The SportsBottle GripType is:" + this.gripType);
	}

}// class SportsBottle ends here

class ThermosBottle extends Bottle {
	String DoublewallInsulation; // class members here
	String VaccumSealed;
	double HeatRetentionHours;

	ThermosBottle(int capacity, String material, String color, String isReusable, String brandname,
			String doublewallInsulation, String vaccumSealed, double heatRetentionHours) {
		super(capacity, material, color, isReusable, brandname);
		DoublewallInsulation = doublewallInsulation;
		VaccumSealed = vaccumSealed;
		HeatRetentionHours = heatRetentionHours;
	}

	void display() // Responsibility  here 
		{
			super.display();
			System.out.println("The DoubleWallInsulation is:"+this.DoublewallInsulation);
			System.out.println("The ThermosBottle VaccumSealed is :"+this.VaccumSealed);
			System.out.println("The HeatRetentio is :"+this.HeatRetentionHours);
			
		}

}// class ends here

public class TestBottle  // class struture here 
{

	public static void main(String[] args) // behaviour here 
 
	{
		// object created in the heap area

		Bottle b1 = new Bottle(10, "Plastic", "White", "Yes", "Kinley");

		System.out.println(" The Bottle details are Here ");

		b1.display();
		
		System.out.println("----------------------------------------------");
	

		WaterBottle w1 = new WaterBottle(12, "Plastic", "Red", "Yes", "Kinley", "Yes", 10.00, "yes");

		System.out.println(" The WaterBottle details are Here ");

		w1.display();
		
		System.out.println("----------------------------------------------");

		SportsBottle s1 = new SportsBottle(12, "Plastic", "Red", "Yes", "Kinley", "Yes", "Yes", "Rubber");

		System.out.println(" The SportsBottle details are Here ");

		s1.display();
		
		System.out.println("----------------------------------------------");

		ThermosBottle t1 = new ThermosBottle(12, "Plastic", "Red", "Yes", "Kinley", "Yes", "Yes", 10.00);

		System.out.println("The Thermos Bottle details are Here ");

		t1.display();
		
		System.out.println("----------------------------------------------");

	}

}
