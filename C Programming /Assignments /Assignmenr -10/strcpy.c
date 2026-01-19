//Copy one string into another string.
#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	printf("Enter the string \n");
	printf(" Before copying  the string :\n");	
	scanf("%s",str);
	
	char str2[20];
	strcpy(str2,str);
	
	printf(" After copying the string :%s",str2);
	
}

