#include <stdio.h>
#include<stdlib.h>
void main()
{
	int *arr;
    int i,n;

    printf("Enter number of elements:\n ");
    scanf("%d", &n);

    // Dynamic memory allocation
    arr = (int *)malloc(n * sizeof(int));

    // Check if memory allocated or not
    if (arr == NULL)
    {
        printf("Memory allocation failed\n");
        return 1;
    }

    // Input elements
    printf("Enter array elements:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
        
    }
   
    printf("Alternate elements:\n");

    for(i = 0; i < 5; i = i + 2)
    {
        printf("%d ", arr[i]);
    }
}

