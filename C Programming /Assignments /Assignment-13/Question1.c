#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
void main()
{
    int *a;
    int i, n, min, max;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    // Dynamic memory allocation
    a = (int *)malloc(n * sizeof(int));

    // Check if memory allocated or not
    if (a == NULL)
    {
        printf("Memory allocation failed");
        return 1;
    }

    // Input elements
    printf("Enter array elements:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    // Initialize min and max
    min = max = a[0];

    // Find min and max
    for (i = 0; i < n; i++)
    {
        if (a[i] > max)
            max = a[i];

        if (a[i] < min)
            min = a[i];
    }

    printf("Maximum = %d\n", max);
    printf("Minimum = %d\n", min);

    // Free allocated memory
    free(a);

}

