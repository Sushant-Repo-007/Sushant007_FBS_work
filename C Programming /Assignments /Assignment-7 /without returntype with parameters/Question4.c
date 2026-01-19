#include<stdio.h>
void isprime(num);
void main()
{
	int num=7;
	isprime(num);
} //main ends here 
void isprime(num)
{
		int i=2,flag=0;
		while(i<num)
	{
		if(num%i==0)
		{
			flag=1;
			break;
		}
		
	  i++;
	}
	if(flag==0)
		{
			printf("This is a prime number %d",num);
		}
		else
		{
			printf("This is not a prime number: %d",num);
			
		}	
}
