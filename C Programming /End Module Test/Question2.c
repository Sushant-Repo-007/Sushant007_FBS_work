//write a program to print folliwng series 
//1+11+111+1111..... n times 
#include<stdio.h>
{

void main()
{
    int n, i;
    int term = 0;
    int sum = 0;

    printf("Enter value of n: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++) // iteration  
    {
        term = term * 10 + 1;   // create next term 
        sum = sum + term;      // add to sum
    }

    printf("Sum of series = %d\n", sum); //printed 
}

	
	
	
		
	
}
