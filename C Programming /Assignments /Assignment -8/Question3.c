#include <stdio.h>

void main()
{
    int arr[5] = {10, 25, 5, 40, 15};
    int i, sum = 0;

    for(i = 0; i < 5; i++)
    {
        sum = sum + arr[i];
    }

    printf("Sum of all numbers = %d", sum);
}

