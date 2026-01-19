//without  returntype with parameters
#include<stdio.h>
void armstrong(int n);
void main()
{
	int n = 153;
	armstrong(n);
} // main end here 
void armstrong(int n)
{
		int  temp, rem, sum = 0;

		temp = n;

	while(temp > 0)
	{
    	rem = temp % 10;
    	sum = sum + (rem*rem*rem);
    	temp = temp / 10;
	}

	if(sum == n)
    	printf("Armstrong");
	else
    	printf("Not Armstrong");
}
