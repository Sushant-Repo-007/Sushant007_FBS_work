#include <stdio.h>

void main()
{
    int *arr = (int *)malloc(10 * sizeof(int));
    int i;

    printf("Original array:\n");
    for(i = 0; i < 5; i++)
    {
        printf("%d ", arr[i]);
    }

    printf("\nReversed array:\n");
    for(i = 4; i >= 0; i--)
    {
        printf("%d ", arr[i]);
    }
    free(arr);
}

