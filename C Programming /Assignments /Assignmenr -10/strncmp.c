#include<stdio.h>
#include<string.h>

void main()
{
	char str1[10];
	char str2[10];
	int n;
	printf("Enter first string:\n");
	scanf("%s",str1);

	printf("Enter second string:\n");
	scanf("%s",str2);
	
	printf("Enter how many elements you wanted to campare it :");
	scanf("%d",&n);
	int  res =strncmp(str1,str2,n);
		
	printf("The cpmapred with n elements is : %d",res);	
	
//	Here n number of strings are compared with the second strings as and 
//	the result is been printed so far and the resulted vale is got
	
}

