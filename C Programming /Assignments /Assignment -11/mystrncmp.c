#include <stdio.h>
int mystrncmp(char*, char*,int);
void main()
{
    char str1[20], str2[20];
    int res;
	int n;
    printf("Enter string 1: ");
    scanf("%s", str1);

    printf("Enter string 2: ");
    scanf("%s", str2);
    
    printf("Enter n of elements to comapare :");
    scanf("%d",&n);

    res = mystrncmp(str1, str2,n);

    if (res == 0)
        printf("Strings are same");
    else
        printf("Strings are not same");
}

int mystrncmp(char* str1, char* str2,int n)
{

    int i;

    for (i = 0; i < n; i++)
    {
        if (str1[i] != str2[i])
            return str1[i] - str2[i];

        if (str1[i] == '\0' || str2[i] == '\0')
            return str1[i] - str2[i];
    }

    return 0;   // ? must return 0 if first n characters match


}


