//mystrncat
#include <stdio.h>

char *mystrncat(char *dest, const char *src, int n)
{
    int i = 0, j = 0;

    // Move i to end of dest
    while (dest[i] != '\0')
    {
        i++;
    }

    // Append src characters
    while (j < n && src[j] != '\0')
    {
        dest[i] = src[j];
        i++;
        j++;
    }

    dest[i] = '\0';   // null terminate

    return dest;
}

