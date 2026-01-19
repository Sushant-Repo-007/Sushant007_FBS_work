#include <stdio.h>
#include<stdlib.h>
void main()
{
    int *arr;
    int i,n,j;	

    printf("Enter number of elements: ");
    scanf("%d", &n);
// size /

    // Dynamic memory allocation
    arr = (int *)malloc(n * sizeof(int));

    // Check if memory allocated or not
    if (arr == NULL)
    {
        printf("Memory allocation failed\n");
        return 1;
	}

    printf("Enter array elements:\n");
    for(i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Prime numbers are:\n");

    for(i = 0; i < n; i++)
    {
        for(j = 2; j < arr[i]; j++)
        {
            if(arr[i] % j == 0)
                break;
        }

        if(j == arr[i] && arr[i] > 1)
            printf("%d ", arr[i]);
    }
}

