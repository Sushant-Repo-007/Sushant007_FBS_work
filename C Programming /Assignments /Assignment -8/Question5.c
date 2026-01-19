#include <stdio.h>

void main()
{
    int arr[5] = {10, 25, 5, 40, 15};
    int i;

    printf("Alternate elements:\n");

    for(i = 0; i < 5; i = i + 2)
    {
        printf("%d ", arr[i]);
    }
}

