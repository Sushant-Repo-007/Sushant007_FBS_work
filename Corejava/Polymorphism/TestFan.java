class Fan {
	String Brandname;
	String Color;
	String SpeedLevel;
	String PowerConsumption;
	int NumberOfBlades;
	String Switch;

	static int count = 0;

	String getBrandname() {
		return Brandname;`
	}

	void setBrandname(String brandname) {
		Brandname = brandname;
	}

	String getColor() {
		return Color;
	}

	void setColor(String color) {
		Color = color;
	}

	String getSpeedLevel() {
		return SpeedLevel;
	}

	void setSpeedLevel(String speedLevel) {
		SpeedLevel = speedLevel;
	}

	String getPowerConsumption() {
		return PowerConsumption;
	}

	void setPowerConsumption(String powerConsumption) {
		PowerConsumption = powerConsumption;
	}

	int getNumberOfBlades() {
		return NumberOfBlades;
	}

	void setNumberOfBlades(int numberOfBlades) {
		NumberOfBlades = numberOfBlades;
	}

	String getSwitch() {
		return Switch;
	}

	void setSwitch(String switch1) {
		Switch = switch1;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Fan.count = count;
	}

	// Constructor
	Fan(String brandname, String color, String speedLevel, String powerConsumption, int numberOfBlades,
			String switch1) {
		Brandname = brandname;
		Color = color;
		SpeedLevel = speedLevel;
		PowerConsumption = powerConsumption;
		NumberOfBlades = numberOfBlades;
		Switch = switch1;

		count++;
	}

// same method called here 
	String getFanType() {
		return "Normal Fan";
	}

	void display() {
		System.out.println("Brandname: " + Brandname);
		System.out.println("Color: " + Color);
		System.out.println("SpeedLevel: " + SpeedLevel);
		System.out.println("PowerConsumption: " + PowerConsumption);
		System.out.println("NumberOfBlades: " + NumberOfBlades);
		System.out.println("Switch: " + Switch);
	}
}

// ---------------- CeilingFan ----------------

class CeilingFan extends Fan {
	int Rodlength;
	String LightEnabled;
	String BladeSpan;

	CeilingFan(String brandname, String color, String speedLevel, String powerConsumption, int numberOfBlades,
			String switch1, int rodlength, String lightEnabled, String bladeSpan) {
		super(brandname, color, speedLevel, powerConsumption, numberOfBlades, switch1);

		Rodlength = rodlength;
		LightEnabled = lightEnabled;
		BladeSpan = bladeSpan;
	}

	// same method called here but implemented differently here

	String getFanType() {
		return "Ceiling  Fan";
	}

	void display() {
		super.display();
		System.out.println("RodLength: " + Rodlength);
		System.out.println("LightEnabled: " + LightEnabled);
		System.out.println("BladeSpan: " + BladeSpan);
	}
}

// ---------------- TableFan ----------------

class TableFan extends Fan {
	String Basetype;
	String Isportable;

	TableFan(String brandname, String color, String speedLevel, String powerConsumption, int numberOfBlades,
			String switch1, String basetype, String isportable) {
		super(brandname, color, speedLevel, powerConsumption, numberOfBlades, switch1);

		Basetype = basetype;
		Isportable = isportable;
	}

	// same method called here but implemented differently here

	String getFanType() {
		return "Table Fan";
	}

	void display() {
		super.display();
		System.out.println("BaseType: " + Basetype);
		System.out.println("IsPortable: " + Isportable);
	}
}
// ---------------- Main Class ----------------

public class TestFan {
	public static void main(String[] args) {
		Fan f1 = new Fan("Bajaj", "Red", "Off", "Low", 4, "Yes");

		System.out.println("----- Fan Details -----");
		f1.display();

		System.out.println("The Fan type is :" + f1.getFanType());

		System.out.println("-----------------------");

		f1 = new CeilingFan("Usha", "Blue", "Off", "Low", 4, "Yes", 10, "Yes", "Fixed");

		System.out.println("----- CeilingFan Details -----");

		f1.display();

		System.out.println("The Fan type is :" + f1.getFanType());

		System.out.println("-----------------------");

		f1 = new TableFan("Usha", "Blue", "Off", "Low", 4, "Yes", "Table", "Yes");

		System.out.println("----- TableFan Details -----");
		f1.display();

		System.out.println("The Fan type is :" + f1.getFanType());

		System.out.println(" The Total Count is : " + Fan.getCount());

	}
}