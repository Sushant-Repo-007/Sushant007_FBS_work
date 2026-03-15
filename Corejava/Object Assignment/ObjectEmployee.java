class Employee  // structure :state behaviour identity responsibility 
{

	int id;
 	String name;
 	double  salary;	// member
	
	//Employee ( )		//default constructor 
	//{
		//this.id=0;
		//this.name="Enter the name:";
		//this.salary=1000;
	//}


	Employee (int id, String name,double sl)
	{
		this.id=id;
		this.name=name;
		this.salary=sl;	
			
	}			//paramertized constructor 	


	
	void setid(int id)

	{
		this.id= id;
	}
	void setname(String name)
	{
		this.name = name;	
	}

	void setsalary(double sl)
	{
		this.salary = sl;
	}
	
	int getid()
	{
		return id;	
	}
		
	String getname()
	{
		return name;	
	}

	double  getsalary()
	{
		return salary;
	}

	
	void display()  // printed the member function values using function ... 
	{
			
		System.out.println("The employee ID is  : " + id);		
		System.out.println("The  employee name  : " + name);
		System.out.println("The employee salary : " + salary);		
		
	}	

	

}// classbankAccount ends here 

class TestEmployee
{
    public static void main(String[] args)  // main method also has called has an behaviour JVm calls the main function 
    {
        Employee e1;          // reference variable   pattern  like pointer here 
			
        e1 = new Employee (0,"Enter name",1000);  // object created in heap

	//e1.setid(101);   // parameter passed in set 
	//e1.setname("Sushant"); // parameter passed in set 
	//e1.setsalary(1000);  // parameter passed in set 
	
	e1.display();	 // displayed the object member using function 

        	 
		
    }
}











