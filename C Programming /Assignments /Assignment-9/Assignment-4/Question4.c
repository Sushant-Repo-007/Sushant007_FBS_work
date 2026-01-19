#include <stdio.h>

void isprime(int arr[], int size);   // function declaration

void main()
{
    int num[] = {1,2,3,4,5,6,7,8,9,10};
    int size = 10;

    isprime(num, size);   // function call
}

// function definition
void isprime(int arr[], int size)
{
    int i, j, flag;

    for(i = 0; i < size; i++)   // loop for array elements
    {
        if(arr[i] <= 1)
        {
            printf("%d is not prime\n", arr[i]);
            continue;
        }

        flag = 0;

        for(j = 2; j < arr[i]; j++)   // prime check
        {
            if(arr[i] % j == 0)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 0)
            printf("%d is prime\n", arr[i]);
        else
            printf("%d is not prime\n", arr[i]);
    }
}

