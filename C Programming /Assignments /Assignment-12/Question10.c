// Write a program to check the string is palindrome or not
#include <stdio.h>
#include <string.h>

int main()
{
    char str[50];
    int i, len, flag = 1;

    printf("Enter the string here: ");
    scanf("%s", str);

    len = strlen(str);

    for (i = 0; i < len / 2; i++)
    {
        if (str[i] != str[len - 1 - i])
        {
            flag = 0;
            break;
        }
        
        
    }

    if (flag == 1)
        printf("The string is Palindrome");
    else
        printf("The string is Not Palindrome");

    return 0;
}

