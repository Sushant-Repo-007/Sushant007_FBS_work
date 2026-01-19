//WAP to Calculate the Number of Words Present in a String

#include<stdio.h>
void main()
{
	char str[20];
	printf("Enter the string here :");
	scanf("%s",str);
	
	int i=0;
	int count;
	while (str[i]!='\0')
	{			
		i++;
		count++; 
	}
	 printf(" The No of words Present in the string is :%d",count);
}
