#include <stdio.h>

int main()
{
    int n, num, i, flag;

    printf("Enter n: ");
    scanf("%d", &n);

    printf("Prime numbers between 1 and %d are:\n", n);

    for (num = 2; num <= n; num++)
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
            printf("%d ", num);
    }

    return 0;
}

