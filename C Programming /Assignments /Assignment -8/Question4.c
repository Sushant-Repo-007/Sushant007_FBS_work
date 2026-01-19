#include <stdio.h>

void main()
{
    int arr[5] = {10, 25, 5, 40, 15};
    int i;

    printf("Even numbers:\n");
    for(i = 0; i < 5; i++)
    {
        if(arr[i] % 2 == 0)
            printf("%d ", arr[i]);
    }

    printf("\nOdd numbers:\n");
    for(i = 0; i < 5; i++)
    {
        if(arr[i] % 2 != 0)
            printf("%d ", arr[i]);
    }
}

