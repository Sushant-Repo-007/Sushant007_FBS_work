#include<stdio.h>

void main()
{
    int n = 145, temp, rem, sum = 0, i, fact;

    temp = n;

    while(temp > 0)
    {
        rem = temp % 10;     // extract digit

        fact = 1;            // factorial of each digit
        for(i = 1; i <= rem; i++)
        {
            fact = fact * i;
        }

        sum = sum + fact;    // add factorial to sum
        temp = temp / 10;    // remove last digit
    }

    if(sum == n)
        printf("Strong Number");
    else
        printf("Not Strong Number");
}

