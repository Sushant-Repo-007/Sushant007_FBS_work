#include<stdio.h>
void sum(int ,int );
void main()
{
	int start=1, end=5;
	
	 sum(start,end );
}	//main ends here
void sum(int start ,int end)
{
//	sum=1+2+3+4+5;
	int sum=0;
	while(start<=end)
	{
		sum=sum+start;
 
		start++;
	}
		printf("The Sum of the numbers are:%d\n",sum);
}
