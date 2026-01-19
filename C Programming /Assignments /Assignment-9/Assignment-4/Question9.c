#include <stdio.h>

// function declaration
void palindrome(int arr[], int size);

void main()
{
    int arr[10], size = 10, i;

    printf("Enter the array elements:\n");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    palindrome(arr, size);   // function call
}

// function definition
void palindrome(int arr[], int size)
{
    int i, temp, rem, rev;

    for (i = 0; i < size; i++)
    {
        temp = arr[i];
        rev = 0;

        while (temp > 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (rev == arr[i])
            printf("%d is Palindrome\n", arr[i]);
        else
            printf("%d is Not Palindrome\n", arr[i]);
    }
}

