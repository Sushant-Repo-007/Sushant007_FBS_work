class SalesManager  // structure state,  behaviour , identity ,responsibility,
{
	 
	int id;
 	String name;	// class members
 	double salary;
 	double incentive;
 	int target;

		
	//SalesManager()		//default constructor 
	//{
		//this.id=0;
		//this.name="Enter the name";
		//this.salary=0000;
		//this.incentive=000;
		//this.target=0;
	//}

	
	SalesManager(int id,String name, double salary, double incentive, int target)		//parameterized  constructor 
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.incentive=incentive;
		this.target=target;
	}		

	


	void setid(int id)
	{
		this.id=id;
	}
	
	void setname(String name)
	{
		this.name=name;
	}

	void setsalary(double  salary)
	{
		this.salary=salary;
	}

	void setincentive(double inc)
	{
		this.incentive=inc;
	}	
	
	void settarget(int  target)
	{
		this.target=target;
	}
	

	int getid()
	{
		return id;
	}

	 String getname()
	{
		return name;
	}
	
	double getsalary()
	{
		return salary;
	}
	
	double  getincentive()
	{
		return incentive;
	}
	
	double  gettarget()
	{
		return target;
	}
	
	

	void display()
	{
	System.out.println("The SalesManager id  : " + id);
        	 System.out.println("The SalesManagerName  is : " +name);
	 System.out.println("The SalesManager salary is : " + salary);	
	System.out.println("The SalesManager incentive is : " +incentive);
	System.out.println("The SalesManager incentive is : " + target);	
		
	}

	
}

class TestSalesManager
{
    public static void main(String[] args)
    {
        SalesManager s1;          // reference variable
        s1 = new SalesManager(0,"Enter the name",1000,100,10);  // object created in heap

        	//s1.setid(101);
        	//s1.setname ("Sushant");
	 //s1.setsalary (20000);
	//s1.setincentive (120.20);
	//s1.settarget (10);
 	
               s1.display(); //invoked display print function ... 		
    }
}











