//without  returntype and without  parameter 
#include <stdio.h>
void palindrome();   // function declaration

void main()
{
    palindrome();    // function calling
}

void palindrome()    // function definition
{
    int first, last;
    int N = 123;

    first = N / 100;   // first digit
    last  = N % 10;    // last digit

    if (first == last)
    {
        printf("It is a palindrome");
    }
    else
    {
        printf("It is not a palindrome");
    }
}

