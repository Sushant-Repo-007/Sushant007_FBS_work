class placedStudent
{
	String frn;
	String studentName;
	int distanceCovered;
	String companyName;
	String designation;  // members 


	placedStudent()	//default constructor ... 
	{
		this.frn="FRN00000";
		this.studentName="Enter the name";
		this.distanceCovered=000;
		this.companyName="Enter the name";
		this.designation="NA";	
	}	

		

	void setfrn(String frn)   // attributes set 
	{
		this.frn=frn;		
	}

	void setstudentName( String name)
	{
		this.studentName=name;
	}

	void setdistanceCovered( int Dc)
	{
		this.distanceCovered=Dc;
	}	
	
	void setcompanyName( String CName)
	{
		this.companyName=CName;
	}
	
	void setdesignation( String desgn)
	{
		this.designation=desgn;
	}
	
	
	 String getfrn()
	{
		return frn;   // getting the values 
	}

	String getstudentName()
	{
		return studentName;         // getting the values 
	}
		
	int  getdistanceCovered()
	{
		return distanceCovered;          // getting the values 
	}	
	
	String getdesignation()
	{
		return designation;               // getting the values 
	}

void display()
{
	System.out.println("The FRN of student is : " + frn);
        	System.out.println("The name of student is : " + studentName);
        	System.out.println("The distance covered is : " + distanceCovered);
	System.out.println("The distance covered is : " + companyName);
	System.out.println("The distance covered is : " + designation);

}

}

class TestplacedStudent
{
    public static void main(String[] args)
    {
        placedStudent s1;          // reference variable
        s1 = new placedStudent();  // object created in heap

        	
	
	//s1.setfrn ("FRN-22J10208/003");  	// paramter passed to set 
        	//s1.setstudentName ("Sushant");	 // paramter passed to set 
	 //s1.setdistanceCovered  (10);		 // paramter passed to set 
 	//s1.setcompanyName ("Microsoft");	 // paramter passed to set 
	//s1.setdesignation ("developer");		 // paramter passed to set 

              	s1.display();
    }	
}











