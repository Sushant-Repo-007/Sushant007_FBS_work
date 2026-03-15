class Shape
{
    double area;
    static int count = 0;

    Shape(double area)
    {
        this.area = area;
        count++;
    }

    void display()
    {
        System.out.println("Area: " + area);
    }

    static int getCount()
    {
        return count;
    }
}

class Circle extends Shape
{
    int radius;

    Circle(double area, int radius)
    {
        super(area);
        this.radius = radius;
    }

    void display()
    {
        super.display();
        System.out.println("Radius: " + radius);
    }
}

class Triangle extends Shape
{
    int base;
    int height;

    Triangle(double area, int base, int height)
    {
        super(area);
        this.base = base;
        this.height = height;
    }

    void display()
    {
        super.display();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }
}

class Rectangle extends Shape
{
    int length;
    int breadth;

    Rectangle(double area, int length, int breadth)
    {
        super(area);
        this.length = length;
        this.breadth = breadth;
    }

    void display()
    {
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}

public class TestShape
{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle(50, 10, 5);
        Circle c1 = new Circle(16, 4);
        Rectangle r1 = new Rectangle(50, 10, 5);

        System.out.println("----- Triangle Details -----");
        t1.display();

        System.out.println("\n----- Circle Details -----");
        c1.display();

        System.out.println("\n----- Rectangle Details -----");
        r1.display();

        System.out.println("\nTotal Shapes Created: " + Shape.getCount());
    }
}