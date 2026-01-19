#include <stdio.h>

// without parameter, with return type
int consonantandvowel();

void main()
{
    int res;

    res = consonantandvowel();   // function calling

    if (res == 1)
    {
        printf("This is a Vowel");
    }
    else if(res == 0)
    {
        printf("This is a Consonant");
    }
}

int consonantandvowel()
{
    char th = 'A';

    if (th == 'A' || th == 'E' || th == 'I' || th == 'O' || th == 'U' ||
        th == 'a' || th == 'e' || th == 'i' || th == 'o' || th == 'u')
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

