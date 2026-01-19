#include <stdio.h>
//mystrncasecmp()
int mystrncasecmp(const char *s1, const char *s2, int n)
{
    while (n > 0 && *s1 && *s2)
    {
        char c1 = *s1;
        char c2 = *s2;

        // convert to lowercase
        if (c1 >= 'A' && c1 <= 'Z')
            c1 = c1 + 32;

        if (c2 >= 'A' && c2 <= 'Z')
            c2 = c2 + 32;

        if (c1 != c2)
            return c1 - c2;

        s1++;
        s2++;
        n--;
    }

    if (n > 0)
        return *s1 - *s2;

    return 0;
}

