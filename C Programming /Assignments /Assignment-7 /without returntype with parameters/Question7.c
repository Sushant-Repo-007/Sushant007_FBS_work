//without returtype with parameters/
#include<stdio.h>
void factorial(int);
void main()
{
	int n = 5; 
	factorial(n);
} //main ends here 
void factorial(int n)
{
	 int i = 1, fact = 1;

    while(i <= n)
    {
        fact = fact * i;
        i++;
    }

    printf(" The Factorial is :%d", fact);
}
