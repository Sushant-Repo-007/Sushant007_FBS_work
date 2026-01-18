#include<stdio.h>
int main ()
{
	int a=2,b=4,temp;
	temp=a;
	a=b;
	b=temp;
	printf("This is the swapping of two numbers:%d",temp);
	
	return 0;	
}
