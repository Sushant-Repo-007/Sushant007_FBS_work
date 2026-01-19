//WAP to Count the Number of Vowels in a String

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
		if(str[i]=='a' || str[i]=='e' || str[i]=='i',str[i]=='o',str[i]=='u')
		{
		
			count++;		
		}			
		i++;
	}
	 printf(" The counr is :%d",count);
}
