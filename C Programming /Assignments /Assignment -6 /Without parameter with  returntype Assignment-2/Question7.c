#include <stdio.h>

int Agecheck();   // function declaration

int main()
{
    int res;
    res = Agecheck();   // function calling

    if (res == 1)
        printf("Child\n");
    else if (res == 2)
        printf("Teenager\n");
    else if (res == 3)
        printf("Adult\n");
    else if (res == 4)
        printf("Senior\n");

    return 0;
}

int Agecheck()   // function definition
{
    int age = 45;   // hardcoded age

    if (age < 12)
        return 1;
    else if (age >= 12 && age <= 19)
        return 2;
    else if (age >= 20 && age <= 59)
        return 3;
    else
        return 4;
}

