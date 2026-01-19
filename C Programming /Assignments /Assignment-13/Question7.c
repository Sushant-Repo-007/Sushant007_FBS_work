#include <stdio.h>
#include <stdlib.h>   // for malloc, free

int main()
{
    int *arr, *brr, *crr;
    int i, size = 5;

    // Dynamic memory allocation
    arr = (int *)malloc(size * sizeof(int));
    brr = (int *)malloc(size * sizeof(int));
    crr = (int *)malloc(size * sizeof(int));

    // Check memory allocation
    if(arr == NULL || brr == NULL || crr == NULL)
    {
        printf("Memory allocation failed");
        return 1;
    }

    // Initialize arrays
    for(i = 0; i < size; i++)
    {
        arr[i] = i + 1;           // 1 2 3 4 5
        brr[i] = (i + 1) * 10;    // 10 20 30 40 50
    }

    // Add arrays
    for(i = 0; i < size; i++)
    {
        crr[i] = arr[i] + brr[i];
    }

    // Print result
    printf("Sum array elements:\n");
    for(i = 0; i < size; i++)
    {
        printf("%d ", crr[i]);
    }

    // Free memory
    free(arr);
    free(brr);
    free(crr);

    return 0;
}

