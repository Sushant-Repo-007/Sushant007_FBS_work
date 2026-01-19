#include <stdio.h>

// function declaration
void sum(int arr[], int size);

void main()
{
    int arr[10], size = 10, i;

    printf("Enter the array elements:\n");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    sum(arr, size);   // function call
}

// function definition
void sum(int arr[], int size)
{
    int i, temp, first, last;

    for (i = 0; i < size; i++)
    {
        temp = arr[i];

        last = temp % 10;   // last digit

        while (temp >= 10)
        {
            temp = temp / 10;
        }

        first = temp;       // first digit

        printf("Number = %d, Sum of first & last digit = %d\n",
               arr[i], first + last);
    }
}

