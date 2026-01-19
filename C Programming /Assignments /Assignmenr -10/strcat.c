#include<stdio.h>
#include<string.h>
void main()
{
	char str1[10];
	char str2[10];
	
	printf("Enter first string:\n");
	scanf("%s",str1);

	printf("Enter second string:\n");
	scanf("%s",str2);
	
	char* res =strcat(str1,str2);
		
	printf("The Concatenation of  strings is %s",res);	
	
}

