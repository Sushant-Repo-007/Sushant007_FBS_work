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
	char* res=strstr(str1,str2);
	
	  if (res != NULL)
        printf("\nSubstring found in concatenated string %s",res);
    else
        printf("\nSubstring not found");
}

