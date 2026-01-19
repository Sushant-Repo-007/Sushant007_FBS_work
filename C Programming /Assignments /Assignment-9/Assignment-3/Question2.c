#include <stdio.h>

void palindrome(int arr[], int size);   // function declaration

int main()
{
    int arr[10];
    int size, i;

    printf("Enter how many numbers: ");
    scanf("%d", &size);

    printf("Enter %d three-digit numbers:\n", size);
    for(i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    palindrome(arr, size);   // function call
    return 0;
}

void palindrome(int arr[], int size)   // function definition
{
    int i, num, rev, temp;

    for(i = 0; i < size; i++)
    {
        num = arr[i];
        temp = num;
        rev = 0;

        while(temp > 0)
        {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }

        if(num == rev)
            printf("%d is Palindrome\n", num);
        else
            printf("%d is Not Palindrome\n", num);
    }
}

