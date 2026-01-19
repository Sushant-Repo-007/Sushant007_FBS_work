//without  returntype and with  parameter 
//1. Write a program to check whether a number is even or odd.

#include<stdio.h>
int evenodd(int num); //function declaration 
void main()
{
	int num,res;
	printf("Enter the number\n ");
	scanf("%d",&num);
	
	res=evenodd(num); // function calling 
	if(res==1)
	{
		printf("No is even:");	
	}else if(res==0)
	{
		printf("No is odd:");	
	}
}
int evenodd(int x) //function called 
{
	if (x%2==0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	

}
