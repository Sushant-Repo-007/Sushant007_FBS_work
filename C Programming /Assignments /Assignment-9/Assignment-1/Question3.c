#include<stdio.h>

void perfect(int*, int);

void main()
{
    int arr[10], i, size = 10;

    printf("Enter array elements:\n");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    perfect(arr, size);
} // main ends here 

void perfect(int *arr, int size)
{
    int i, j, sum;

    printf("Perfect numbers in the array are:\n");

    for (i = 0; i < size; i++)
    {
        sum = 0;

        for (j = 1; j <= arr[i] / 2; j++)
        {
            if (arr[i] % j == 0)
            {
                sum = sum + j;
            }
        }

        if (sum == arr[i] && arr[i] != 0)
        {
            printf("%d ", arr[i]);
        }
    }
}

