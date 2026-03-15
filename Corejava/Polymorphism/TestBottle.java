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

		Count++;
	}

	void open() {
		System.out.println("Opening a normal w bottle");
	}

	void drink() {
		System.out.println("Drinking through bottle ");
	}

	void clean() {
		System.out.println("Cleaning the bottle");
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

	void open() {
		System.out.println("Opening a normal water bottle");
	}

	void drink() {
		System.out.println("Drinking normal water");
	}

	void clean() {
		System.out.println("Cleaning water bottle");
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

	@Override
	void open() {
		System.out.println("Opening sports bottle with flip cap");
	}

	@Override
	void drink() {
		System.out.println("Drinking quickly while running");
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

	@Override
	void open() {
		System.out.println("Unscrewing thermos lid carefully");
	}

	@Override
	void drink() {
		System.out.println("Drinking hot or cold preserved liquid");
	}

	void display() // Responsibility here
	{
		super.display();
		System.out.println("The DoubleWallInsulation is:" + this.DoublewallInsulation);
		System.out.println("The ThermosBottle VaccumSealed is :" + this.VaccumSealed);
		System.out.println("The HeatRetentio is :" + this.HeatRetentionHours);

	}

}// class ends here

public class TestBottle // class struture here
{

	public static void main(String[] args) // behaviour here

	{
		// object created in the heap area

		Bottle b1 = new Bottle(10, "Plastic", "White", "Yes", "Kinley");

		System.out.println(" The Bottle details are Here ");

		b1.display();
		b1.clean();
		b1.open();
		b1.drink();

		System.out.println("----------------------------------------------");

		b1 = new WaterBottle(12, "Plastic", "Red", "Yes", "Kinley", "Yes", 10.00, "yes");

		System.out.println(" The WaterBottle details are Here ");

		b1.display();
		b1.open();
		b1.drink();
		b1.clean();

		System.out.println("----------------------------------------------");

		b1 = new SportsBottle(12, "Plastic", "Red", "Yes", "Kinley", "Yes", "Yes", "Rubber");

		System.out.println(" The SportsBottle details are Here ");

		b1.display();
		b1.open();
		b1.drink();

		System.out.println("----------------------------------------------");

		b1 = new ThermosBottle(12, "Plastic", "Red", "Yes", "Kinley", "Yes", "Yes", 10.00);

		System.out.println("The Thermos Bottle details are Here ");

		b1.display();
		b1.open();
		b1.drink();

		System.out.println("The Total count is :" + Bottle.getCount());

		System.out.println("----------------------------------------------");

	}

}
