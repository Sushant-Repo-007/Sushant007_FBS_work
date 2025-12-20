#include<stdio.h>
#include<string.h>
//Write a program to count number of words in a string 

void main() 
{
//	char str;
//	printf("Enter the string");
//	scanf("%s",str);
	int count=0; //count 
	int i=0;
	char a[20] = "Hello";

    printf("Length: %d\n", strlen(a));
	while (a[i]!='\0')
	{

	i++;
	count++;
	}
	printf(" The length of the above string is :%d",count);
	
} // main ends here 

