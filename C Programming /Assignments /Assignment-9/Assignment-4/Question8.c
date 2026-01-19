#include <stdio.h>

// function declaration
void strongnumber(int arr[], int size);

void main()
{
    int arr[10], size = 10, i;

    printf("Enter the array elements:\n");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    strongnumber(arr, size);   // function call
}

// function definition
void strongnumber(int arr[], int size)
{
    int i, temp, rem, sum, fact, j;

    for (i = 0; i < size; i++)   // traverse array
    {
        temp = arr[i];
        sum = 0;

        while (temp > 0)
        {
            rem = temp % 10;

            fact = 1;
            for (j = 1; j <= rem; j++)
            {
                fact = fact * j;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == arr[i])
            printf("%d is a Strong Number\n", arr[i]);
        else
            printf("%d is Not a Strong Number\n", arr[i]);
    }
}

