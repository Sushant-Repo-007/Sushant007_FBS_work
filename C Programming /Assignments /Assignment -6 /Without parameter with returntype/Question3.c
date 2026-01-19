#include <stdio.h>

int leapyear();   // function declaration

void main()
{
    int result;

    result = leapyear();   // function calling

    if (result == 1)
    {
        printf("This is a leap year");
    }
    else if(res == 0)
    {
        printf("This is not a leap year");
    }
}

int leapyear()   // function definition
{
    int year = 2003;

    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

