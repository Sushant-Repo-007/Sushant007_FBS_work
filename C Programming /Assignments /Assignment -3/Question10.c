#include<stdio.h>

void main()
{
    int n = 12345, temp, first, last;

    temp = n;

    last = temp % 10;   // get last digit

    while(temp >= 10)   // loop to find first digit
    {
        temp = temp / 10;
    }

    first = temp;       // remaining digit is first

    printf("Sum = %d", first + last);
}

