#include <stdio.h>

void mystrcat(char str1[], char str2[])
{
    int i = 0, j = 0;

    // Move i to end of str1
    while (str1[i] != '\0')
    {
        i++;
    }

    // Copy str2 into str1
    while (str2[j] != '\0')
    {
        str1[i] = str2[j];
        i++;
        j++;
    }

    // Add null character
    str1[i] = '\0';
}

void main()
{
    char str1[40], str2[20];

    printf("Enter first string: ");
    scanf("%s", str1);

    printf("Enter second string: ");
    scanf("%s", str2);

    mystrcat(str1, str2);

    printf("After concatenation: %s", str1);
}

