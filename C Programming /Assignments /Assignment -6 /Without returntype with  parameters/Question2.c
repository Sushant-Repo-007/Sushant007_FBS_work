//without  returntype and with  parameter 
#include <stdio.h>
void palindrome(int  num);   // function declaration

void main()
{
	int num;
	printf("Enter the  three digit number\n ");
	scanf("%d",&num);
	
    palindrome(num);    // function calling
}

void palindrome(int x )    // function definition
{
    int first, last;
    
    first = x/ 100;   // first digit
    last  = x % 10;    // last digit

    if (first == last)
    {
        printf("It is a palindrome");
    }
    else
    {
        printf("It is not a palindrome");
    }
}

