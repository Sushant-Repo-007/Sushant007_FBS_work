package Demo;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeController ec = new EmployeeController();

        int choice;

        do {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Enter id name salary");

                    int id = sc.nextInt();
                    String name = sc.next();
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, salary);

                    int res = ec.addEmployee(emp);

                    if (res != 0) {

                        System.out.println("Employee Added Successfully");

                    } else {

                        System.out.println("Failed");
                    }

                    break;

                case 2:

                    System.out.println("\n===== Employee List =====");

                    ec.displayAllEmployees();

                    break;

                case 3:

                    System.out.println("Enter Employee ID To Search");

                    int id2 = sc.nextInt();

                    Employee emp2 = ec.searchEmployeeByID(id2);

                    if (emp2 != null) {

                        System.out.println("\nEmployee Found");
                        System.out.println(emp2);

                    } else {

                        System.out.println("Employee Not Found");
                    }

                    break;

                case 4:

                    int updateChoice;

                    do {

                        System.out.println("\n===== Update Menu =====");

                        System.out.println("1. Update Employee Name");
                        System.out.println("2. Update Employee Salary");
                        System.out.println("3. Back");

                        System.out.print("Enter Choice: ");

                        updateChoice = sc.nextInt();

                        switch (updateChoice) {

                            case 1:

                                System.out.println("Enter Employee ID");

                                int id3 = sc.nextInt();

                                System.out.println("Enter New Name");

                                String newName = sc.next();

                                int res4 = ec.UpdateEmployeeByName(id3, newName);

                                if (res4 != 0) {

                                    System.out.println("Employee Name Updated Successfully");

                                    Employee updatedEmp =
                                            ec.searchEmployeeByID(id3);

                                    System.out.println(updatedEmp);

                                } else {

                                    System.out.println("Employee Not Found");
                                }

                                break;

                            case 2:

                                System.out.println("Enter Employee ID");

                                int id4 = sc.nextInt();

                                System.out.println("Enter New Salary");

                                double newSalary = sc.nextDouble();

                                int res5 =
                                        ec.UpdateEmployeeBySalary(id4, newSalary);

                                if (res5 != 0) {

                                    System.out.println("Employee Salary Updated Successfully");

                                    Employee updatedEmp =
                                            ec.searchEmployeeByID(id4);

                                    System.out.println(updatedEmp);

                                } else {

                                    System.out.println("Employee Not Found");
                                }

                                break;

                            case 3:

                                System.out.println("Returning To Main Menu");

                                break;

                            default:

                                System.out.println("Invalid Choice");
                        }

                    } while (updateChoice != 3);

                    break;

                case 5:

                    System.out.println("Enter Employee ID To Delete");

                    int id1 = sc.nextInt();

                    int result = ec.deletEmployeeByid(id1);

                    if (result != 0) {

                        System.out.println("Employee Deleted Successfully\n");
                        ec.displayAllEmployees();

                    } else {

                        System.out.println("Employee Not Found and Check the Employee ID You Entered ");
                    }

                    break;

                case 6:

                    System.out.println("Program Exited Successfully");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}