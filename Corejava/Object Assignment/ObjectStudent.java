class Student  // structure state ,identity ,behaviour ,responsibilty 
{
    String frn;
    String studentName;
    int distanceCovered;   // data members

	Student()		// default constructor 
	{
		this.frn="FRN0000";
		this.studentName="Enter the name";
		this.distanceCovered=0;
	}
	

	void setfrn(String frn)
	{
		this.frn=frn;
	}
	
	void setstudentName(String Sn)
	{
		this.studentName=Sn;
	}
	
	void setdistanceCovered( int dc)
	{
		this.distanceCovered=dc;
	}
	
	String getfrn()
	{
		return frn;
	}
		
	String getstudentName()
	{
		return studentName;
	}

	 int getdistanceCovered()
	{
		return distanceCovered;
	}

	

	void display()
	{
		 System.out.println("The FRN of student is : " + frn);
        		System.out.println("The name of student is : " + studentName);
        		System.out.println("The distance covered is : " + distanceCovered);
	}

}

class TestStudent
{
    public static void main(String[] args)
    {
        Student s1;          // reference variable
        s1 = new Student();  // object created in heap

        //s1.setfrn ("FRN-22J10208/003");
        //s1.setstudentName ("Sushant");
        //s1.setdistanceCovered(9);	
	
	s1.display();	

       
    }
}
