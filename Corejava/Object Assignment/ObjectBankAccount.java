class BankAccount		//structure // 
{

	int  accountNumber;  // member
	String holderName;
	double  currentBalance;
	double interestRate;


		//BankAccount()			// default constructor 
		//{
			//this.accountNumber=0;
			//this.holderName="Please Enter the Name:";
			//this.currentBalance=0000;
			//this.interestRate=100;	
		//}


		BankAccount(int number, String hname, double cureentb, double  interestrate)			// parameterized  constructor 
		{
			this.accountNumber=number;
			this.holderName= hname;
			this.currentBalance=cureentb;
			this.interestRate=interestrate;	
		}
			
		
		

	void setaccountNumber(int no)		// behaviour set attribute and its value.
	{
		this.accountNumber = no;
	}
	void setholderName(String hn)
	{
		this.holderName = hn;	
	}

	void setcurrentBalance(double cb)
	{
		this.currentBalance = cb;
	}
	void setinterestRate(double Ir)

	{
		this.interestRate = Ir;		
	}

	int getaccountNumber()			//
	{
		return accountNumber;	
	}
		
	String getholderName()
	{
		return holderName;	
	}

	double  getcurrentBalance()
	{
		return currentBalance;
	}

	double  getinterestRate()

	{
		 return interestRate;		
	}
	

	void display()  // printed the member function values using function ... 
	{
			
		System.out.println("The AccountNumber : " + accountNumber);		
		System.out.println("The Holdername  : " + holderName);
		System.out.println("The currentBalance : " + currentBalance);		
		System.out.println("The InterestRate : " + interestRate);
		
	}	

	
	

}// classbankAccount ends here 

class TestBankAccount
{
    public static void main(String[] args)
    {
        BankAccount b1;          // reference variable
        b1 = new BankAccount(00,"Enter the Name:",1000,100);  // object created in heap

	//b1.setaccountNumber(101); 
	//b1.setholderName("Sushant");
	//b1.setcurrentBalance(1000);
	//b1.setinterestRate(100);
		

	b1.display();	 // displayed the object member using function 

        	 
		
    }
}











