#include <stdio.h>

void prime(int *arr, int size);   // function declaration

void main()
{
    int arr[10], i, size = 10;

    printf("Enter the array elements:\n");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    prime(arr, size);   // function call
}

void prime(int *arr, int size)
{
    int i, j, flag;

    printf("Prime numbers in the array are:\n");

    for (i = 0; i < size; i++)
    {
        if (arr[i] <= 1)
            continue;

        flag = 0;
        for (j = 2; j <= arr[i] / 2; j++)
        {
            if (arr[i] % j == 0)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            printf("%d ", arr[i]);
    }
}

