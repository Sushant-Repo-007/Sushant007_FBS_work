#include <stdio.h>

int operations();   // function declaration (with return type, no parameter)

void main()
{
    int res;
    res = operations();   // function calling

    printf("Result = %d\n", res);
   
}

int operations()    // function definition
{
    int a = 20;       // hardcoded number 1
    int b = 5;        // hardcoded number 2
    char op = '*';    // hardcoded operator

    int result = 0;

    if (op == '+')
        result = a + b;
    else if (op == '-')
        result = a - b;
    else if (op == '*')
        result = a * b;
    else if (op == '/')
    {
        if (b != 0)
            result = a / b;
        else
            printf("Error: Division by zero\n");
    }
    else if (op == '%')
    {
        if (b != 0)
            result = a % b;
        else
            printf("Error: Modulo by zero\n");
    }
    else
        printf("Invalid Operator\n");

    return result;   // returning value to main
}

