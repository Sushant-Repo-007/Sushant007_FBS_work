#include <stdio.h>

void armstrong(int number[], int size);   // function declaration

void main()
{
    int number[5] = {10, 20, 30, 40, 50};

    armstrong(number, 5);   // function call
}

void armstrong(int number[], int size)   // function definition
{
    int i, temp, rem, sum;

    for (i = 0; i < size; i++)
    {
        temp = number[i];
        sum = 0;   // reset sum for each number

        while (temp > 0)
        {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }

        if (sum == number[i])
            printf("%d is Armstrong\n", number[i]);
        else
            printf("%d is Not Armstrong\n", number[i]);
    }
}

