#include <stdio.h>

float total_salary();   // function declaration
// without parameter with return type

int main()
{
    float res;
    res = total_salary();   // function calling

    printf("The total salary is: %.2f", res);
    return 0;
}

float total_salary()   // function definition
{
    float salary, da, ta, hra, total;
    salary = 3000.00;

    if (salary <= 5000)
    {
        da = salary * 0.10;
        ta = salary * 0.20;
        hra = salary * 0.25;
    }
    else
    {
        da = salary * 0.15;
        ta = salary * 0.25;
        hra = salary * 0.30;
    }

    total = salary + da + ta + hra;
    return total;
}

