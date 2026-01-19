#include <stdio.h>

void main()
{
    int arr[5] = {10, 25, 5, 40, 15};
    int i, key, found = 0;

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
}

