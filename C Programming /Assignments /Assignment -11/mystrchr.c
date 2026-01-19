//mystrchr
#include <stdio.h>

char *mystrchr(const char *str, char ch)
{
    int i = 0;

    while (str[i] != '\0')
    {
        if (str[i] == ch)
        {
            return (char *)&str[i];   // return address
        }
        i++;
    }

    return NULL;   // character not found
}

