#include <stdio.h>

// without parameter, with return type
int uppercaseandlowercase();   // declaration

void main()
{
    int res;

    res = uppercaseandlowercase();   // function calling

    if (res == 1)
    {
        printf("This is an Uppercase letter");
    }
    else
    {
        printf("This is a Lowercase letter");
    }
}

int uppercaseandlowercase()   // function definition
{
    char ch = 'a';

    if (ch >= 'A' && ch <= 'Z')
    {
        return 1;   // Uppercase
    }
    else
    {
        return 0;   // Lowercase
    }
}

