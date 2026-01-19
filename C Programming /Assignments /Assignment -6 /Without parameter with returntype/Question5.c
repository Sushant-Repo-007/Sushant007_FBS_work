#include<stdio.h>
//without parameter without  returntype
int vote();
void main{
	int res;
	res=vote(); //functionn calling 
    if (res == 1)
    {
      	printf("You are Eligible for Voting :");
    }
    else id(res==0)
    {
        printf("You are not Eligible for Voting:");
    }
}

int vote() //function called 
{
///	program for elgible of Voting with repect to its age 	
	int vote =19;
	
	if (vote>=18)
	{
		return 1;
	}
	else 
	{
		return 0;
	}
	
}
