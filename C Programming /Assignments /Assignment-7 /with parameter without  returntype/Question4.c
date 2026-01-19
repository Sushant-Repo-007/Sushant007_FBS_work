void strongnumber(int);
void main()
{
	int n;
	strongnumber(n);
} // main ends here 
void strongnumber(int n)
{
	int i,j,num, digit;
    int fact, sum;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++)
    {
        num = i;
        sum = 0;

        while (num > 0)
        {
            digit = num % 10;

            fact = 1;
            for (j = 1; j <= digit; j++)
            {
                fact = fact * j;
            }

            sum = sum + fact;
            num = num / 10;
        }

        if (sum == i)
        {
            printf(" Strong  number is :%d ", i);
        }
    }

	
	
}
