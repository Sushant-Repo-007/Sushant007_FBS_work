//with parameter without  returntype
//Print table for the Given number 
#include<stdio.h>
void table(int);
void main()
{
	int n = 5;
	
	table(n);
} //main ends here 
void table(int n)
{
	
	int i=1;
	
	while (i<=n)
	{
		printf("The Table of 5 is :%d\n",n*i);
		i++;
	}
}
