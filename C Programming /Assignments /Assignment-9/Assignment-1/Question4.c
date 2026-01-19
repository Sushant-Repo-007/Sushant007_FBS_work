#include <stdio.h>

void strongnumber(int*, int);

void main()
{
    int arr[10], i, size = 10;

    printf("Enter the array elements:\n");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    strongnumber(arr, size);
}

void strongnumber(int *arr, int size)
{
    int i, j, num, digit, fact, sum;

    printf("Strong numbers in the array are:\n");

    for (i = 0; i < size; i++)
    {
        num = arr[i];
        sum = 0;

        while (num > 0)
        {
            digit = num % 10;

            fact = 1;
            for (j = 1; j <= digit; j++)
            {
                fact = fact * j;
            }

            sum = sum + fact;
            num = num / 10;
        }

        if (sum == arr[i])
        {
            printf("%d ", arr[i]);
        }
    }
}

