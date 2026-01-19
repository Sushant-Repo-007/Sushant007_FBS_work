#include <stdio.h>
#include <string.h>
void main()
{
	char str1[10];
	char str2[10];
	
	printf("Enter the first string :");
	scanf("%s",str1);
	printf("Enter the second  string :");
	scanf("%s",str2);
	int res=strcmp(str1,str2);
	
	if (res==0)
	{
		printf("compared ");
	}
	else{
		
		printf("Not comapred ");
	} 

}

