//with  returntype and without  parameter 
//
// 
int palindrome(); //function declaration 
void main()
{
	int res;
	palindrome(); // function calling 
	if(res==1)
	{
		 printf("It is a palindrome");
	} 
	else if(palindrome()==0)
	{
	 printf("It is a palindrome");
	}
}
 int palindrome() //function called 
{
	 int first, last;
    int N = 123;

    first = N / 100;   // first digit
    last  = N % 10;    // last digit

    if (first == last)
    {
       return 1;
    }
    else
    {
       return 0;
    }
	

}
