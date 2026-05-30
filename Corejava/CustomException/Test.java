
package ExceptionHandling;

import java.io.*;
public class Test {

	public static void main(String[] args)  throws IOException{
		
//		
//		In Java, exceptions are easiest to remember if you divide them into 2 main categories.
//
//		1. Checked Exceptions
//
//		These are checked by compiler at compile time. Java forces you to handle them.
//
//		Examples:
//
//		IOException
//		SQLException
//		FileNotFoundException
//		ClassNotFoundException
//
//		Example:
		
		FileReader f = new FileReader("abc.txt");
		    
		

//		If you don’t handle it, compiler gives error.
// 
//		Remember:
//
//		Checked = compiler checks before running.
		
		
//---------------------------------------------------------------------------------------------------------
		
		
//
//		try {
//		    int a = 10;
//		    int b = 0;
//		    System.out.println(a / b);   // throw arithmetic exception here 
//		} catch (ArithmeticException e) {
////		    System.out.println("Cannot divide by zero");
////			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("Your Job is Done here ");
//			
//		}// Even if exception does not occurs finallly wille excute here
//		
		
		
		
	
		
//		
//		try {
//		    int a = 10;
//		    int b = 0;
//		    System.out.println(a / b);
//		} catch (ArithmeticException e) {
//		    System.out.println("Cannot divide by zero");
//		}
//		finally {
//			System.out.println("Your Job is Done here ");
//			
//		}
//		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
