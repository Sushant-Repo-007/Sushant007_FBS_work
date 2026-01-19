// WAP to Form a New String where the First and Last Characters are Exchanged
#include <stdio.h>

int main()
{
    char str[50];
    char temp;
    int len = 0;

    printf("Enter the string: ");
    fgets(str, sizeof(str), stdin);

    // find length (ignore newline)
    while (str[len] != '\0' && str[len] != '\n')
        len++;

    // if string has more than one character
    if (len > 1)
    {
        temp = str[0];
        str[0] = str[len - 1];
        str[len - 1] = temp;
    }

    printf("New string: %s", str);

    return 0;
}

