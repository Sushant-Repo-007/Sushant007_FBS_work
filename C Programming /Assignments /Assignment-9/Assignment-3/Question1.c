#include <stdio.h>

void evenodd(int arr[], int size);   // function declaration

int main()
{
    int arr[10];
    int size, i;

    printf("Enter how many numbers: ");
    scanf("%d", &size);

    printf("Enter %d numbers:\n", size);
    for(i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    evenodd(arr, size);   // function call
    return 0;
}

void evenodd(int arr[], int size)   // function definition
{
    int i;
    for(i = 0; i < size; i++)
    {
        if(arr[i] % 2 == 0)
            printf("%d is Even\n", arr[i]);
        else
            printf("%d is Odd\n", arr[i]);
    }
}

