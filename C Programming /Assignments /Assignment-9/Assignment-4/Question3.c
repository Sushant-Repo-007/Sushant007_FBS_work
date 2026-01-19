#include <stdio.h>

void sum(int arr[], int size);   // function declaration

void main()
{
    int arr[] = {1, 2, 3, 4, 5};   // array instead of start & end
    int size = 5;

    sum(arr, size);   // function call
}

// function definition
void sum(int arr[], int size)
{
    int total = 0;
    int i;

    for(i = 0; i < size; i++)
    {
        total = total + arr[i];
    }

    printf("The Sum of the numbers are: %d\n", total);
}

