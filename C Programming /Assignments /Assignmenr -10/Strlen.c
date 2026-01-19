//Find the length of a string using strlen().
#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	printf("Enter the string here :");
	scanf("%s",str);
	int len=strlen(str); 
	printf(" The Entered length of string is :%d",len);
	
}

