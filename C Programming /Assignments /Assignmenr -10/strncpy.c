// Copy one string into another string using strncpy
#include <stdio.h>
#include <string.h>

void main()
{
    char str[20];
    char str2[20];
    int n;

    printf("Enter the string: ");
    scanf("%s", str);

    printf("Enter how many characters you want to copy: ");
    scanf("%d", &n);

    strncpy(str2, str, n);
    str2[n] = '\0';   

    printf("After copying, the string is: %s", str2);

}

