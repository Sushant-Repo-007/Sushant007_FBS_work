class Shape {

	String color; // common attribute
	int x, y; // position
	double dimension1; // size parameter
	double dimension2; // size parameter
	double borderWidth; // outline thickness
	static int count = 0;
	double area;

	static int getCount() {
		return count;
	}

	Shape(String color, int x, int y, double dimension1, double dimension2, double borderWidth) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		this.borderWidth = borderWidth;

		count++;
	}
// constructor here 

	double calculateArea() {
		return area;

	}
	// common method here

	void display() {
		System.out.println("The shape color is :" + color);
		System.out.println("The shape x:" + x);
		System.out.println("The shape y:" + y);
		System.out.println("The shape dimension is :" + dimension1);
		System.out.println("The shape dimension is :" + dimension2);
		System.out.println("The shapes borderwidth is:" + borderWidth);
	}
	// responsibility

} // class shape ends here

class Circle extends Shape {
	int radius;

	Circle(String color, int x, int y, double borderWidth, int radius) {
		super(color, x, y, radius, 0, borderWidth);
		this.radius = radius;
	}
	// parmeterized constructor here

	double calculateArea() {
		return area = Math.PI * radius * radius;

	}

	void display() {
		super.display();
		System.out.println("Radius: " + radius);

	}
} // class circle ends here

class Triangle extends Shape {
	int base;
	int height;

	Triangle(String color, int x, int y, double borderWidth, int base, int height) {
		super(color, x, y, base, height, borderWidth);
		this.base = base;
		this.height = height;
	}

	double calculateArea() {
		return area = 0.5 * base * height;

	}
	// common method here

	void display() {
		super.display();
		System.out.println("Base: " + base);
		System.out.println("Height: " + height);
	}
} // class trinagle ends here

class Rectangle extends Shape {
	int length;
	int breadth;

	Rectangle(String color, int x, int y, double borderWidth, int length, int breadth) {
		super(color, x, y, length, breadth, borderWidth);
		this.length = length;
		this.breadth = breadth;
	}

	// parmeterized constructor here

	double calculateArea() {
		return area = length * breadth;

	}

	// common method here `

	void display() {
		super.display();
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
	}
} // class rectangle ends hee

public class TestShape {
	public static void main(String[] args)

	{

		// common method here

		Shape s = new Shape(null, 2, 2, 2, 2, 2);  // intialized just in case .
			// reference created here and object also created here too  
		

	// reference of the base class used here 
	
		System.out.println("----- Triangle Details -----");
		s = new Triangle("Blue", 10, 5, 2.0, 10, 5);
		s.display();
		System.out.println("The calcualted area of Triangle is :"+s.calculateArea());
		
	
		System.out.println("\n----- Circle Details -----");
		s = new Circle("Red", 0, 0, 1.5, 4);
		s.display();
		System.out.println("The calcualted area of circle is :"+s.calculateArea());

		System.out.println("\n----- Rectangle Details -----");
		s = new Rectangle("Green", 5, 5, 1.0, 10, 5);
		s.display();
		
		System.out.println("The calcualted area of rectangle  is :"+s.calculateArea());

		System.out.println("\nTotal Shapes Created: " + Shape.getCount());
	}
}