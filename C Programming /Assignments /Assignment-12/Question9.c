//WAP to Take in Two Strings and Display the Larger String without Using Built-in
//Functions
#include<stdio.h>
void main()
{
	char str[20];
	char str2[20];
	printf("Enter the first string:");
	scanf("%s",str);
	
	printf("Enter the Second string:");
	scanf("%s",str2);

	int i=0;
	int count;
	while (str[i]!='\0')
	{			
		i++;
		count++; 
	}
	 printf(" The Count of first  string is :%d",count);
	 
	 
	int j=0;
	int count2;
	while (str[j]!='\0')
	{			
		j++;
		count2++; 
	}
	 printf(" Count of Second  string is :%d",count2);
	
	if(count>count2)
	{
		printf("The string First is greater :");
	}
	else 
	if(count2 >count)
	{
		printf("The string Second is Greater :");
	}
	
	
}
