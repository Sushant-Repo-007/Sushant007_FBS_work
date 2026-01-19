//without  returntype and without  parameter 
#include <stdio.h>
void leapyear();   // function declaration

void main()
{
    leapyear();    // function calling
}

void leapyear()    // function definition
{
	int leap_year =2003;

    if ((leap_year % 400 == 0) || (leap_year % 4 == 0 && leap_year % 100 != 0))
	{
		printf("This is an leap year :");
	}
	else
	{
	printf("This is not an leap year :");
	}
   
}

