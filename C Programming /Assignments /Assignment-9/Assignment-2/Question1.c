//without returntype and with  parameter 
//
#include<stdio.h>
void operations(int[] ,int[] ,int ,char); //function declaration 
void main()
{
	int arr[5] = {10,20,30,40,50};       // hardcoded number 1
    int brr[5] = {10,20,30,40,50};        // hardcoded number 2
    char op = '*';    // hardcoded operator (+, -, *, /, %)
	int  size=5;
	operations(arr,brr, size,op); // function calling  
}
void operations(int x[] ,int y[],int size ,char op) //function called 
{

    int result;
    int i;
	for(i=0; i<size; i++)
	{
	
    if (op == '+') {
        result = x[i] + y[i];
        printf("Result = %d\n", result);
    }
    else if (op == '-') {
        result = x[i] - y[i];
        printf("Result = %d\n", result);
    }
    else if (op == '*') {
        result = x[i] * y[i];
        printf("Result = %d\n", result);
    }
    else if (op == '/') {
        if (y!= 0) {
            result = x[i] / y[i];
            printf("Result = %d\n", result);
        } else {
            printf("Error: Division by zero!\n");
        }
    }
    else if (op == '%') {
        if (y!= 0) {
            result = x[i] % y[i];
            printf("Result = %d\n", result);
        } else {
            printf("Error: Modulo by zero!\n");
        }
    }
    else {
        printf("Invalid Operator!");
    }
	}
}
