//with  returntype and without  parameter 
//
//1. Write a program to check whether a number is even or odd.
// 
int evenodd(); //function declaration 
void main()
{
	int res;
	res=evenodd(); // function calling 
	if(res==1)
	{
		printf("The number is Even");
	} 
	else if(evenodd()==0)
	{
	printf("The number is Odd");	
	}
}
 int evenodd() //function called 
{
	int x =6;
	if (x%2==0)
	{
	return 1;
	}
	else
	{
	return 0;
	}
	

}
