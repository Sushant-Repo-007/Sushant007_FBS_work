#include <stdio.h>

int operations(int, int, char);   // function declaration with  datatype 

int main()
{
    int a = 20;
    int b = 5;
    char op = '*';
    int res;

    res = operations(a, b, op);   // function calling

    if (op == '/' && b == 0)
        printf("Error: Division by zero!\n");
    else if (op == '%' && b == 0)
        printf("Error: Modulo by zero!\n");
    else
        printf("Result = %d\n", res);

    return 0;
}

int operations(int x, int y, char op)   // function definition
{
    if (op == '+')
        return x + y;    // returning the result  of the operations  
    else if (op == '-')
        return x - y;    // // returning the result  of the operations  
    else if (op == '*')
        return x * y;     //  // returning the result  of the operations  
    else if (op == '/')
        return x / y;     // division by zero checked in main
        					   // returning the result  of the operations  
    else if (op == '%')
        return x % y;     // modulo by zero checked in main
        						 // returning the result  of the operations  	
    else
        return 0;         // invalid operator
}

