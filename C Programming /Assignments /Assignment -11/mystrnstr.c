//mystrnstr
#include <stdio.h>

char *mystrnstr(const char *str, const char *sub, int n)
{
    int i, j;

    if (sub[0] == '\0')
        return (char *)str;

    for (i = 0; i < n && str[i] != '\0'; i++)
    {
        for (j = 0; sub[j] != '\0'; j++)
        {
            if (i + j >= n || str[i + j] != sub[j])
                break;
        }

        if (sub[j] == '\0')
            return (char *)&str[i];
    }

    return NULL;
}

