class Admin		//structure : state ,identity ,behaviour ,responsibility 
{
    	int id;			//class member or structure member
    	String name;		
    	double salary;
    	double allowance;
	
		//Admin()		// default constructor 
		//{
		//	this.id=0;
		//	this.name="Enter Name :";
		//	this.salary=5000;
		//	this.allowance=100;	
						
		//}	

		Admin(int id,String name, double salary, double allowance)  	// parameterized constructor 
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.allowance=allowance;	
		}

		

    	void setid(int id)			//set the attribute values using the behaviour we mutet the object  
    	{
        		this.id = id;
    	}	

    	void setname(String name)
    	{
        		this.name = name;
    	}

    	void setsalary(double s)
    	{
        		this.salary = s;
    	} 

   	 void setallowance(double a)
    	{
        		this.allowance = a;
    	} 

    	int getid()			// values we can take out using the get using the behaviour 
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

    	double getallowance()
    	{
        		return allowance;
 	  }

   	 void display()
    	{
        		System.out.println("The Admin id is : " + id);
        		System.out.println("The Admin name is : " + name);
        		System.out.println("The Admin salary is : " + salary);
        		System.out.println("The Admin allowance is : " + allowance);
    	}
}

class TestAdmin
{
    public static void main(String[] args)
    {
        Admin a1;// reference created here  like pointer 
	a1= new Admin(0,"Enter Name",5000,100);  // here object is created in the heap a1  // parameters passed using this .. 

        //a1.setid(0);
        //a1.setname("Sushant");  approach of writing this we can set attribute with values inside using setter 
        //a1.setsalary(5000);
        //a1.setallowance(100);

        a1.display();		// display the objects state using dispaly function 
    }
}
