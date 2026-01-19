#include <stdio.h>

void leapyear(int arr[], int size);   // function declaration

void main()
{
    int year[10];
    int size, i;

    printf("Enter how many years: ");
    scanf("%d", &size);

    printf("Enter %d years:\n", size);
    for(i = 0; i < size; i++)
    {
        scanf("%d", &year[i]);
    }

    leapyear(year, size);    // function call
}

/* Function definition */
void leapyear(int arr[], int size)
{
    int i;

    for(i = 0; i < size; i++)
    {
        if ((arr[i] % 400 == 0) || (arr[i] % 4 == 0 && arr[i] % 100 != 0))
        {
            printf("%d is a Leap Year\n", arr[i]);
        }
        else
        {
            printf("%d is Not a Leap Year\n", arr[i]);
        }
    }
}

