#include <stdio.h>

void main()
{
    int a[10], n, i, j;

    printf("Enter number of elements: ");
    scanf("%d", &n);
// size /


    printf("Enter array elements:\n");
    for(i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("Prime numbers are:\n");

    for(i = 0; i < n; i++)
    {
        for(j = 2; j < a[i]; j++)
        {
            if(a[i] % j == 0)
                break;
        }

        if(j == a[i] && a[i] > 1)
            printf("%d ", a[i]);
    }
}

