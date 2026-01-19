//without  returntype and without  parameter 

void Result(); //function declaration 
void main()
{
	Result(); // function calling  
}
void Result() //function called 
{
	 int marks = 68;   // hardcoded value

    if (marks > 75) {
        printf("Distinction\n");
    }
    else if (marks > 65) {
        printf("First Class\n");
    }
    else if (marks > 55) {
        printf("Second Class\n");
    }
    else if (marks >= 40) {
        printf("Pass Class\n");
    }
    else {
        printf("Fail\n");
    }

 
}
