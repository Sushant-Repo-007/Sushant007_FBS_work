//without returntype and with  parameter 
//
#include<stdio.h>
void operations(int ,int char); //function declaration 
void main()
{
	int a = 20;       // hardcoded number 1
    int b = 5;        // hardcoded number 2
    char op = '*';    // hardcoded operator (+, -, *, /, %)
	
	operations(a,b,op); // function calling  
}
void operations(int x ,int y,char op) //function called 
{

    int result;

    if (op == '+') {
        result = x + y;
        printf("Result = %d\n", result);
    }
    else if (op == '-') {
        result = x - y;
        printf("Result = %d\n", result);
    }
    else if (op == '*') {
        result = x * y;
        printf("Result = %d\n", result);
    }
    else if (op == '/') {
        if (b != 0) {
            result = x / y;
            printf("Result = %d\n", result);
        } else {
            printf("Error: Division by zero!\n");
        }
    }
    else if (op == '%') {
        if (b != 0) {
            result = x % y;
            printf("Result = %d\n", result);
        } else {
            printf("Error: Modulo by zero!\n");
        }
    }
    else {
        printf("Invalid Operator!");
    }

}
