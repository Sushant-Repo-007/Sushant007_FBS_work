#include<stdio.h>
void perfect(int);
void main()
{
	int n;
	 perfect(n);
} // main ends here 
void perfect(int n)
{
	 int i, j, sum;
    printf("Enter the value of n: ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++)
    {
        sum = 0;

        for (j = 1; j <= i / 2; j++)
        {
            if (i % j == 0)
            {
                sum = sum + j;
            }
        }

        if (sum == i && i != 0)
        {
            printf(" The Perfect no is :%d ", i);
        }
    }
	
	
}

