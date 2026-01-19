#include <stdio.h>

char *mystrrchr(const char *str, char ch)
{
    char *last = NULL;
    int i = 0;

    while (str[i] != '\0')
    {
        if (str[i] == ch)
        {
            last = (char *)&str[i];
        }
        i++;
    }

    return last;
}

