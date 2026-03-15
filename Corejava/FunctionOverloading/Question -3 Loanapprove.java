import java.util.Scanner;

class Bank
{
    double loan_amount;

    // Loan approval for Student
    void approveLoan(Student s1)
    {
        if (s1.getPercentage() >= 80)
        {
            loan_amount = 200000;
            System.out.println("Student Name: " + s1.getName());
            System.out.println("Loan Approved: ₹ " + loan_amount);
        }
        else if (s1.getPercentage() >= 60)
        {
            loan_amount = 100000;
            System.out.println("Student Name: " + s1.getName());
            System.out.println("Loan Approved: ₹ " + loan_amount);
        }
        else if (s1.getPercentage() >= 40)
        {
            loan_amount = 50000;
            System.out.println("Student Name: " + s1.getName());
            System.out.println("Loan Approved: ₹ " + loan_amount);
        }
        else
        {
            System.out.println("Student Name: " + s1.getName());
            System.out.println("No Loan Approved");
        }
    }

    // Loan approval for Employee
    void approveLoan(Employee e1)
    {
        if (e1.getAnnualSalary() >= 500000)
        {
            loan_amount = 500000;
            System.out.println("Employee Name: " + e1.getName());
            System.out.println("Loan Approved: ₹ " + loan_amount);
        }
        else if (e1.getAnnualSalary() >= 300000)
        {
            loan_amount = 300000;
            System.out.println("Employee Name: " + e1.getName());
            System.out.println("Loan Approved: ₹ " + loan_amount);
        }
        else
        {
            System.out.println("Employee Name: " + e1.getName());
            System.out.println("No Loan Approved");
        }
    }
}   // ✅ Bank class closed properly here


// Student class
class Student
{
    int rollNo;
    String name;
    double percentage;

    Student(int rollNo, String name, double percentage)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    int getRollNo() { return rollNo; }
    void setRollNo(int rollNo) { this.rollNo = rollNo; }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    double getPercentage() { return percentage; }
    void setPercentage(double percentage) { this.percentage = percentage; }
}


// Employee class
class Employee
{
    int id;
    String name;
    double annualSalary;

    Employee(int id, String name, double annualSalary)
    {
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
    }

    int getId() { return id; }
    void setId(int id) { this.id = id; }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    double getAnnualSalary() { return annualSalary; }
    void setAnnualSalary(double annualSalary) { this.annualSalary = annualSalary; }
}

class TestLoan
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the roll no:");
        int roll_no = in.nextInt();

        System.out.println("Enter the student name:");
        String sname = in.next();

        System.out.println("Enter the percentage:");
        double percentage = in.nextDouble();

        Student s1 = new Student(roll_no, sname, percentage);

        System.out.println("-------------------------------------");

        System.out.println("Enter the employee id:");
        int id = in.nextInt();

        System.out.println("Enter the employee name:");
        String ename = in.next();

        System.out.println("Enter the annual salary:");
        double annualSalary = in.nextDouble();

        Employee e1 = new Employee(id, ename, annualSalary);

        System.out.println("-------------------------------------");

        Bank b1 = new Bank();

        // Method Overloading
        b1.approveLoan(s1);
        b1.approveLoan(e1);

        in.close();
    }
}
