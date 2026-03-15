// Parent class
class Shape 
	{

   	 double area;

		    // Overloaded method for Triangle
    		void calculateArea(Triangle t) 
		{
       			 area = 0.5 * t.base * t.height;
        			System.out.println("Area of Triangle: " + area);
    		}

   	 // Overloaded method for Rectangle
    	void calculateArea(Rectangle r) 
	{
	        	area = r.length * r.breadth;
        		System.out.println("Area of Rectangle: " + area);
    	}

   		 // Overloaded method for Circle
    	void calculateArea(Circle c)
	{
        		area = Math.PI * c.radius * c.radius;
        		System.out.println("Area of Circle: " + area);
    	}
}

// Triangle class
class Triangle {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}

// Rectangle class
class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

// Circle class
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
}

// Main class
class TestArea {
    public static void main(String[] args) {

        Shape s = new Shape();

        Triangle t = new Triangle(10, 5);
        Rectangle r = new Rectangle(8, 4);
        Circle c = new Circle(7);

        s.calculateArea(t);  // Triangle
        s.calculateArea(r);  // Rectangle
        s.calculateArea(c);  // Circle
    }
}
