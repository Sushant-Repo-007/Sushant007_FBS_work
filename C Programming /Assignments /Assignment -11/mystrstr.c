//mystrstr
#include <stdio.h>

char *mystrstr(const char *str, const char *sub)
{
    int i, j;

    // If substring is empty
    if (sub[0] == '\0')
        return (char *)str;

    for (i = 0; str[i] != '\0'; i++)
    {
        for (j = 0; sub[j] != '\0'; j++)
        {
            if (str[i + j] != sub[j])
                break;
        }

        if (sub[j] == '\0')
            return (char *)&str[i];
    }

    return NULL;
}

