//without  returntype and with  parameter 
#include <stdio.h>
int palindrome(int num);   // function declaration

void main()
{
	int num,res;
	printf("Enter the  three digit number\n ");
	scanf("%d",&num);
	
    res=palindrome(num);    // function calling
    if(res==1)
    {
    	printf("It is a palindrome");	
	}else if(res==0)
	{
		printf("It is not a palindrome");	
	}
}

int palindrome(int x )    // function definition
{
    int first, last;
    
    first = x/ 100;   // first digit
    last  = x % 10;    // last digit

    if (first == last)
    {
        
    }
    else
    {
        
    }
}

