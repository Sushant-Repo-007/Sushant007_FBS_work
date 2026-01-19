#include <stdio.h>
void armstrong(int *, int); // function declaration
void main()  
{
    int arr[10], size = 10, i;

    printf("Enter 10 array elements:\n");
    for(i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]); // input array elements
    }

    armstrong(arr, size); // call function

}

// function to check Armstrong numbers in array
void armstrong(int *arr, int size)
{
    int i, num, temp, digit, count, sum, power, j;

    printf("Armstrong numbers in the array are:\n");

    for(i = 0; i < size; i++)
    {
        num = arr[i];
        temp = num;
        count = 0;
        sum = 0;

        // count digits
        while(temp != 0)
        {
            count++;
            temp /= 10;
        }

        temp = num;

        // calculate sum of powers
        while(temp != 0)
        {
            digit = temp % 10;
            power = 1;
            for(j = 1; j <= count; j++)
                power *= digit;

            sum += power;
            temp /= 10;
        }

        if(sum == num)
            printf("%d ", num);
    }
}

