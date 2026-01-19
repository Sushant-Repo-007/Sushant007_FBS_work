#include <stdio.h>
#include <stdlib.h>

int main()
{
    int arr[5] = {1, 2, 3, 4, 5};
    int brr[5] = {10, 20, 30, 40, 50};

    int *crr;     // pointer for merged array
    int i;

    // Dynamic memory allocation for 10 integers
    crr = (int *)malloc(10 * sizeof(int));

    // Check allocation
    if (crr == NULL)
    {
        printf("Memory allocation failed");
        return 1;
    }

    /* Copy first array */
    for (i = 0; i < 5; i++)
    {
        crr[i] = arr[i];
    }

    /* Copy second array */
    for (i = 0; i < 5; i++)
    {
        crr[i + 5] = brr[i];
    }

    printf("Merged array:\n");
    for (i = 0; i < 10; i++)
    {
        printf("%d ", crr[i]);
    }

    // Free allocated memory
    free(crr);

    return 0;
}

