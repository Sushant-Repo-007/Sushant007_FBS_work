#include <stdio.h>

void perfect(int arr[], int size);   // function declaration

void main()
{
    int arr[10] = {6, 10, 28, 40, 50, 60, 70, 80, 90, 100};

    perfect(arr, 10);    // function call
}

void perfect(int arr[], int size)   // function definition
{
    int i, j, sum;

    for (i = 0; i < size; i++)
    {
        sum = 0;   // reset sum for each number

        for (j = 1; j < arr[i]; j++)
        {
            if (arr[i] % j == 0)
            {
                sum = sum + j;   // add divisor
            }
        }

        if (sum == arr[i])
            printf("%d is Perfect\n", arr[i]);
        else
            printf("%d is Not Perfect\n", arr[i]);
    }
}

