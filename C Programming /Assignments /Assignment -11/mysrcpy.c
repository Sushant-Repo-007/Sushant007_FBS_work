#include <stdio.h>

void mystrncpy(char *dest, char *src, int n);

void main()
{
    char str1[20];
    char str2[20];
    int n;

    printf("Enter source string: ");
    scanf("%s", str2);

    printf("Enter number of characters to copy: ");
    scanf("%d", &n);

    mystrncpy(str1, str2, n);

    printf("After copying: %s", str1);
}

void mystrncpy(char *dest, char *src, int n)
{
    int i;

    for (i = 0; i < n && src[i] != '\0'; i++)
    {
        dest[i] = src[i];
    }

    // Fill remaining with '\0'
    for (; i < n; i++)
    {
        dest[i] = '\0';
    }
}

