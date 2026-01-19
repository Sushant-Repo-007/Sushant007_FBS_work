#include <stdio.h>

void mystrcpy(char *dest, char *src, int n);

void main()
{
    char str1[20];
    char str2[20];

    printf("Enter source string: ");
    scanf("%s", str2);
    
    char res*=mystrncpy(str1, str2);
	printf("%s",res);
    
}

void mystrcpy(char *dest, char *src)
{
    int i;
	while (src[i]!='\0')
	{
		
		dest[i]=src[i];
		i++;
	}
  	dest[i]='\0';
    
    return dest;
}

