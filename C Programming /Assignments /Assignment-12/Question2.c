// WAP Replace all Occurrences of ‘a’ with $ in a String
#include <stdio.h>

void replace(char *str, char oldchar, char newchar);

int main()
{
    char str[20] = "This is a string";

    replace(str, 'a', '$');

    return 0;
}

void replace(char *str, char oldchar, char newchar)
{
    int i = 0;

    while (str[i] != '\0')
    {
        if (str[i] == oldchar)
        {
            str[i] = newchar;
        }
        i++;
    }

    printf("%s", str);
}

