// structure state ,behaviour,identity,responsibility
class HR
{
	 int id;
 	String name;
 	float salary;	// class members
	float commission;

		//HR( )	//default constructor
		//{
			//this.id=0;
			//this.name="Enter the name :";
			//this.salary=1000;
			//this.commission=0;
				
		//}	

		HR( int id, String name, float salary,float commission)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.commission=commission;
		}			        // parmeterized constructor 
					


	void setid(int id)   // attributes set here using behaviour 
	{
		this.id=id;
	}
	void setname(String name)
	{
		this.name=name;
	}
	void setsalary(float salary)
	{
		this.salary=salary;
	}
	void setcommission(float commission)
	{
		this.commission=commission;
	}
	

	int getid()
	{
		return id;
	}	
	
	String getname()
	{
		return name;
	}
	
	float getsalary()
	{
		return salary;
	}
	

	float  getcommission()
	{
		return commission;
	}

	
	void display()
	{
		
	System.out.println("The HR id  : " +id);
        	 System.out.println("The HR name is : " + name);
	 System.out.println("The HR  salary is : " +salary);	
	 System.out.println("The HR  commission  is : " +commission);	
		
	}
	

} // class ends here 

class TestHR
{
    public static void main(String[] args)
    {
       HR h1;          // reference variable
        h1 = new HR(0,"enter name ",1000,00);  // object created in heap

        	
	//h1.setid(101);
              	//h1.setname("Sushant");		//passing parameter// using setter means using behaviour 
	//h1.setsalary(10000);
	//h1.setcommission(100);

	h1.display();	// invoked the display function 
    }
}



















// structure state ,behaviour,identity,responsibility
class HR
{
	 int id;
 	String name;
 	float salary;	// class members
	float commission;

		//HR( )	//default constructor
		//{
			//this.id=0;
			//this.name="Enter the name :";
			//this.salary=1000;
			//this.commission=0;
				
		//}	

		HR( int id, String name, float salary,float commission)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.commission=commission;
		}			        // parmeterized constructor 
					


	void setid(int id)   // attributes set here using behaviour 
	{
		this.id=id;
	}
	void setname(String name)
	{
		this.name=name;
	}
	void setsalary(float salary)
	{
		this.salary=salary;
	}
	void setcommission(float commission)
	{
		this.commission=commission;
	}
	

	int getid()
	{
		return id;
	}	
	
	String getname()
	{
		return name;
	}
	
	float getsalary()
	{
		return salary;
	}
	

	float  getcommission()
	{
		return commission;
	}

	
	void display()
	{
		
	System.out.println("The HR id  : " +id);
        	 System.out.println("The HR name is : " + name);
	 System.out.println("The HR  salary is : " +salary);	
	 System.out.println("The HR  commission  is : " +commission);	
		
	}
	

} // class ends here 

class TestHR
{
    public static void main(String[] args)
    {
       HR h1;          // reference variable
        h1 = new HR(0,"enter name ",1000,00);  // object created in heap

        	
	//h1.setid(101);
              	//h1.setname("Sushant");		//passing parameter// using setter means using behaviour 
	//h1.setsalary(10000);
	//h1.setcommission(100);

	h1.display();	// invoked the display function 
    }
}



















