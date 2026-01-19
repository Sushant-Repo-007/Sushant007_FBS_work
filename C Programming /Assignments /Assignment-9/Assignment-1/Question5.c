#include <stdio.h>

void menudriven(int*, int);

void main()
{
    int arr[10], i, size = 10;

    printf("Enter %d numbers:\n", size);
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    menudriven(arr, size);
} // main ends here 

void menudriven(int *arr, int size)
{
    int choice;
    int temp, rev, digit, sum, i, j, flag;

    printf("\nMENU\n");
    printf("1. Check Even or Odd\n");
    printf("2. Check Prime or Not\n");
    printf("3. Check Palindrome or Not\n");
    printf("4. Check Positive, Negative or Zero\n");
    printf("5. Reverse the Number\n");
    printf("6. Find Sum of Digits\n");

    printf("\nEnter your choice: ");
    scanf("%d", &choice);

    for (i = 0; i < size; i++)
    {
        printf("\n\nFor Number: %d\n", arr[i]);

        /* 1. Even or Odd */
        if (choice == 1)
        {
            if (arr[i] % 2 == 0)
                printf("Even");
            else
                printf("Odd");
        }

        /* 2. Prime or Not */
        else if (choice == 2)
        {
            if (arr[i] <= 1)
            {
                printf("Not Prime");
            }
            else
            {
                flag = 0;
                for (j = 2; j <= arr[i] / 2; j++)
                {
                    if (arr[i] % j == 0)
                    {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0)
                    printf("Prime");
                else
                    printf("Not Prime");
            }
        }

        /* 3. Palindrome */
        else if (choice == 3)
        {
            temp = arr[i];
            rev = 0;

            while (temp > 0)
            {
                digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }

            if (rev == arr[i])
                printf("Palindrome");
            else
                printf("Not Palindrome");
        }

        /* 4. Positive / Negative / Zero */
        else if (choice == 4)
        {
            if (arr[i] > 0)
                printf("Positive");
            else if (arr[i] < 0)
                printf("Negative");
            else
                printf("Zero");
        }

        /* 5. Reverse */
        else if (choice == 5)
        {
            temp = arr[i];
            rev = 0;

            while (temp > 0)
            {
                digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }

            printf("Reverse = %d", rev);
        }

        /* 6. Sum of Digits */
        else if (choice == 6)
        {
            temp = arr[i];
            sum = 0;

            while (temp > 0)
            {
                digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            printf("Sum = %d", sum);
        }

        else
        {
            printf("Invalid Choice");
            break;
        }
    }
}

