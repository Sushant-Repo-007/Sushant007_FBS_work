//without  returntype and without  parameter 
#include <stdio.h>
int leapyear(int);   // function declaration

void main()
{
	
	int year,res;
	printf("Enter the Leap year \n ");
	scanf("%d",&year);
    res=leapyear(year);    // function calling
    if(res==1)
    {
    	printf("This is an leap year :");
    	
	}else if(res==0)
	{
		printf("This is not an leap year :");	
	}
}

int leapyear(int x)    // function definition
{
	

    if ((x % 400 == 0) || (x % 4 == 0 && x % 100 != 0))
	{
		return 1;
	}
	else
	{
		return 0;
	}
   
}

