//without returntype and without  parameter 
//

// 
void operations(); //function declaration 
void main()
{
	operations(); // function calling  
}
void operations() //function called 
{
 int a = 20;       // hardcoded number 1
    int b = 5;        // hardcoded number 2
    char op = '*';    // hardcoded operator (+, -, *, /, %)

    int result;

    if (op == '+') {
        result = a + b;
        printf("Result = %d\n", result);
    }
    else if (op == '-') {
        result = a - b;
        printf("Result = %d\n", result);
    }
    else if (op == '*') {
        result = a * b;
        printf("Result = %d\n", result);
    }
    else if (op == '/') {
        if (b != 0) {
            result = a / b;
            printf("Result = %d\n", result);
        } else {
            printf("Error: Division by zero!\n");
        }
    }
    else if (op == '%') {
        if (b != 0) {
            result = a % b;
            printf("Result = %d\n", result);
        } else {
            printf("Error: Modulo by zero!\n");
        }
    }
    else {
        printf("Invalid Operator!");
    }

}
