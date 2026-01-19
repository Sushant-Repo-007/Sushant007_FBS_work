//b. mystrlen
#include<stdio.h>
int  mystrlen(char*);
void main()
{
	char str[]="sushant";
	int res;
	res=mystrlen(str);
	printf(" The length of the string is:%d",res);
}
 int  mystrlen(char* ptr)
{
	int i;
	int count = 0;
	while (ptr[i]!='\0')
	{
	count++;		
	i++;	
	}
	return count;
	
}
