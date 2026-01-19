//without  returntype and without  parameter 
#include <stdio.h>
void leapyear(int);   // function declaration

void main()
{
	
	int year;
	printf("Enter the Leap year \n ");
	scanf("%d",&year);
    leapyear(year);    // function calling
}

void leapyear(int x)    // function definition
{
	

    if ((x % 400 == 0) || (x % 4 == 0 && x % 100 != 0))
	{
		printf("This is an leap year :");
	}
	else
	{
	printf("This is not an leap year :");
	}
   
}

