class Function   // structure: state, entity, behaviour, identity, responsibility  
{
	
   	 void printf(int a ,int b)
    {
        int c = a + b;
        
        System.out.println("The addition is  value is : " + c);        
    }
    
	
  	  void printf(double a ,double b )
    {
        double c = a - b;  
        System.out.println("The subtraction  : " + c);                        
    }
	

	void printf(int  a ,double b )
    {
        double  c = a * b;  
        System.out.println("The Multiplication is : " + c);                        
    }	

	void printf(double a ,int  b )
    {
        double  c = a / b;  
        System.out.println("The Division  is : " + c);                        
    }	
	


}

class Test
{
    	public static void main(String args[])  // behaviour 
    {
        Function f1;          // reference created
        f1 = new Function();  // object created in heap memory 

        	System.out.println("Start\n");
             
	System.out.println("The calculator design is :");   
	
        	f1.printf(10,10);     	//nt 		
        	f1.printf(9,10.20);   // double      		
	f1.printf(10.20,10.20);   //double	 
		         	               
        
        System.out.println("The Calculator is  closed  here ");
    }
}
