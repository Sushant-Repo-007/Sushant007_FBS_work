//without  returntype and without  parameter 

void Agecheck(); //function declaration 
void main()
{
	Agecheck(); // function calling  
}
void Agecheck() //function called 
{
	
	int age = 45;   // hardcoded age

    if (age < 12) {
        printf("Child\n");
    }
    else if (age >= 12 && age <= 19) {
        printf("Teenager\n");
    }
    else if (age >= 20 && age <= 59) {
        printf("Adult\n");
    }
    else {
        printf("Senior\n");
    }

 
}
