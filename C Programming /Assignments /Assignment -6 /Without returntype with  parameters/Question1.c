//without  returntype and with  parameter 
//1. Write a program to check whether a number is even or odd.

#include<stdio.h>
void evenodd(int num); //function declaration 
void main()
{
	int num;
	printf("Enter the number\n ");
	scanf("%d",&num);
	
	evenodd(num); // function calling  
}
void evenodd(int x) //function called 
{
	if (x%2==0)
	{
	printf("No is even:");
	}
	else
	{
	printf("No is odd:");
	}
	

}
