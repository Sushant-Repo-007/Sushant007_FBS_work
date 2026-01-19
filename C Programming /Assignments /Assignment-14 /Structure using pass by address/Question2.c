#include<stdio.h>

 typedef struct  Employee{
	
	int id;
	char name[20]; 
	float salary;
}Employee;

// function declarations
void store(struct Employee *e,int size);
void display(struct Employee *e,int size);

void main()
{
	struct Employee e1[3];
	int size=3;
	store(e1,size);
	display(e1,size);
}
void store(struct Employee *e ,int size)
{
	
	int i;
	
	for(i=0; i<size; i++)
	{
	
    printf("\nEnter Employee details:\n");

    printf("Enter the Employee ID: ");
    scanf("%d",&e[i].id);

    printf("Enter the Employee name: ");
    scanf("%s", e[i].name);

    printf("Enter the Employee Salary: ");
    scanf("%f", &e[i].salary);


	
	}   // IMPORTANT
}

// display function (pass by value)
void display(struct Employee *e,int size)
{
	int i;
	
	for(i=0;i<size; i++)
	{
	
    printf("\n--- Employee Details ---\n");
    printf("Employee ID is : %d\n",e[i].id);
    printf("Employee name is    : %s\n",e[i].name);
    printf("Employee Salary is   : %f\n", e[i].salary);
    
	}
}




