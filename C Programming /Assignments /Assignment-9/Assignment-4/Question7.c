#include <stdio.h>

// function declaration
void factorial(int arr[], int size);

void main()
{
    int arr[10], size = 10, i;

    printf("Enter the array elements:\n");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    factorial(arr, size);   // function call
}

// function definition
void factorial(int arr[], int size)
{
    int i, j, fact;

    for (i = 0; i < size; i++)
    {
        fact = 1;

        for (j = 1; j <= arr[i]; j++)
        {
            fact = fact * j;
        }

        printf("Factorial of %d is %d\n", arr[i], fact);
    }
}

