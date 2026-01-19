#include<stdio.h>
void sum(int);
void main()
{
	int n = 12345;
	 sum(n);
	
}// main ends here 
void sum(int n)
{
	int temp, first, last;

    temp = n;

    last = temp % 10;   // get last digit

    while(temp >= 10)   // loop to find first digit
    {
        temp = temp / 10;
    }

    first = temp;       // remaining digit is first

    printf("Sum = %d", first + last);
}

