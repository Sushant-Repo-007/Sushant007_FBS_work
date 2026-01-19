//with  parameter without  returntype

void armstrong(int );
#include<stdio.h>
void main()
{	int n;
	armstrong(n);
} //main ends here
void armstrong(int n)
{
	int num, temp, digit;
    int count, sum, power, i;

    printf("Enter n: ");
    scanf("%d", &n);

    printf("Armstrong numbers between 1 and %d are:\n", n);

    for (num = 1; num <= n; num++)   // Outer loop
    {
        temp = num;
        count = 0;

        // 1?? Count digits (inner loop)
        while (temp != 0)
        {
            count++;
            temp /= 10;
        }

        temp = num;
        sum = 0;

        // 2?? Calculate Armstrong sum (nested loops)
        while (temp != 0)
        {
            digit = temp % 10;
            power = 1;

            // power calculation using loop
            for (i = 1; i <= count; i++)
            {
                power = power * digit;
            }

            sum = sum + power;
            temp /= 10;
        }

        if (sum == num)
            printf("%d ", num);
    }
	
	
}
