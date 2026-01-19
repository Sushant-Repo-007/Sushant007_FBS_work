#include <stdio.h>

int mystrcmp(char str1[], char str2[])
{
    int i = 0;

    while (str1[i] != '\0' && str2[i] != '\0')
    {
        if (str1[i] != str2[i])
        {
            return str1[i] - str2[i];
        }
        i++;
    }

    return str1[i] - str2[i];
}

void main()
{
    char str1[20], str2[20];
    int res;

    printf("Enter string 1: ");
    scanf("%s", str1);

    printf("Enter string 2: ");
    scanf("%s", str2);

    res = mystrcmp(str1, str2);

    if (res == 0)
        printf("Strings are same");
    else
        printf("Strings are not same");
}

