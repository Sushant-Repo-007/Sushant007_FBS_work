#include<stdio.h>

void perfect(int );
void main()
{
	int n = 28;
	perfect(n);
}//main  ends here 
void perfect(int n)
{
	 int  i = 1, sum = 0;

    while(i < n)
    {
        if(n % i == 0)      
        {
            sum = sum + i;  // add divisor
        }
        i++;
    }

    if(sum == n)
        printf("Perfect");
    else
        printf("Not Perfect");
}
