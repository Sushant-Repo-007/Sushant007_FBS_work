#include <stdio.h>
// menu driven program for 
int main()
{
    int choice;
    int num, temp, rev, digit, sum, i, flag;

    printf("Enter a number: ");
    scanf("%d", &num);

    printf("\nMENU\n");
    printf("1. Check Even or Odd\n");
    printf("2. Check Prime or Not\n");
    printf("3. Check Palindrome or Not\n");
    printf("4. Check Positive, Negative or Zero\n");
    printf("5. Reverse the Number\n");
    printf("6. Find Sum of Digits\n");

    printf("\nEnter your choice: ");
    scanf("%d", &choice);

    /* 1. Even or Odd */
    if (choice == 1)
    {
        if (num % 2 == 0)
            printf("Number is Even");
        else
            printf("Number is Odd");
    }

    /* 2. Prime or Not */
    if (choice == 2)
    {
        if (num <= 1)
        {
            printf("Not a Prime Number");
        }
        else
        {
            flag = 0;
            for (i = 2; i <= num / 2; i++)
            {
                if (num % i == 0)
                {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
                printf("Prime Number");
            else
                printf("Not a Prime Number");
        }
    }

    /* 3. Palindrome or Not */
    if (choice == 3)
    {
        temp = num;
        rev = 0;

        while (temp > 0)
        {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (rev == num)
            printf("Palindrome Number");
        else
            printf("Not a Palindrome Number");
    }

    /* 4. Positive, Negative or Zero */
    if (choice == 4)
    {
        if (num > 0)
            printf("Positive Number");
        if (num < 0)
            printf("Negative Number");
        if (num == 0)
            printf("Zero");
    }

    /* 5. Reverse a Number */
    if (choice == 5)
    {
        temp = num;
        rev = 0;

        while (temp > 0)
        {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        printf("Reverse = %d", rev);
    }

    /* 6. Sum of Digits */
    if (choice == 6)
    {
        temp = num;
        sum = 0;

        while (temp > 0)
        {
            digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        printf("Sum of Digits = %d", sum);
    }

    /* Invalid Choice */
    if (choice < 1 || choice > 6)
    {
        printf("Invalid Choice");
    }

    return 0;
}

