class Employee  // generalized class here .
{
    int id;
    String name;
    double salary;
    static int count = 0;

    // Parameterized constructor
    Employee(int id, String name, double salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        count++;
    }

    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    static int getCount()
    {
        return count;
    }
}

class Admin extends Employee
{
    double allowance;

    Admin(int id, String name, double salary, double allowance)
    {
        super(id, name, salary);
        this.allowance = allowance;
    }

    void display()
    {
        super.display();
        System.out.println("Allowance: " + allowance);
    }
}

class SalesManager extends Employee
{
    double incentive;
    int target;

    SalesManager(int id, String name, double salary, double incentive, int target)
    {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    void display()
    {
        super.display();
        System.out.println("Incentive: " + incentive);
        System.out.println("Target: " + target);
    }
}

class HR extends Employee
{
    double commission;

    HR(int id, String name, double salary, double commission)
    {
        super(id, name, salary);
        this.commission = commission;
    }

    void display()
    {
        super.display();
        System.out.println("Commission: " + commission);
    }
}

public class TestEmployee
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(1,"Sushant",5000);
        Employee e2 = new Employee(2,"Rajesh",6000);

        Admin a1 = new Admin(4,"Sayali",6000,1000);
        SalesManager s1 = new SalesManager(3,"Raju",4000,1000,10);
        HR h1 = new HR(5,"Amit",5500,500);

        System.out.println("---- Admin Details ----");
        a1.display();

        System.out.println("\n---- Sales Manager Details ----");
        s1.display();

        System.out.println("\n---- HR Details ----");
        h1.display();

        System.out.println("\nTotal Employees: " + Employee.getCount());
    }
}