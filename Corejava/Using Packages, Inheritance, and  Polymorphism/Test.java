package p3;

import p1.Employee; // base class 
import p2.Admin; // derived class 
import p2.HR; // derived class 
import p2.SalesManager;  // derived class 

public class Test {

    public static void main(String[] args) {

        Employee[] e1 = new Employee[3]; // 

        e1[0] = new HR(1, "Sushant", 1000, 100);
        e1[1] = new SalesManager(2, "Shubham", 2000, 100, 2);
        e1[2] = new Admin(3, "Jayesh", 3000, 10);

        for (Employee e : e1) {
            e.calsal();
            System.out.println(e);
            System.out.println ("The calculated salary is :" + e.calsal());		// internally calls to string here 
        }
    }
}   // class test ends here