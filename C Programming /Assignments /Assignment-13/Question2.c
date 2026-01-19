#include <stdio.h>
#include <stdlib.h>

void main()
{
    int *a;
    int i,n;
    int key;

    printf("Enter number of elements:\n ");
    scanf("%d", &n);

    // Dynamic memory allocation
    a = (int *)malloc(n * sizeof(int));

    // Check if memory allocated or not
    if (a == NULL)
    {
        printf("Memory allocation failed\n");
        return 1;
    }

    // Input elements
    printf("Enter array elements:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
        
    }
    
    printf("Enter number to search: ");
    scanf("%d", &key);

    for(i = 0; i < 5; i++)
    {
        if(arr[i] == key)
        {
            found = 1;
            break;
        }
    }

    if(found == 1)
        printf("Number %d found at index %d", key, i);
    else
        printf("Number %d not found in array", key);
    
    free(a);

}

