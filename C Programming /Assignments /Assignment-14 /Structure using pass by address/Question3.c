#include<stdio.h>
typedef struct Admin{

	int id;
	char name[20]; 
	float salary;
	float allowance;
}Admin;

// function declarations
void store(Admin *A,int size);
void display(Admin *A,int size);

void main()
{
	struct Admin A[2];
	int size=2;
	store(A,size); //passed address
	display(A,size);
}
void store(Admin *A,int size) // recived here 
{
	int i;
    for(i=0; i<size; i++)
    {
    	
    	printf("\nEnter Admin details:\n");

    	printf("Enter the Admin ID: ");
   		 scanf("%d",&A[i].id);

    printf("Enter the Admin name: ");
    scanf("%s",A[i].name);

    printf("Enter the Admin Salary: ");
    scanf("%f", &A[i].salary);
    
    printf("Enter the HR Hllowances: ");
    scanf("%f", &A[i].allowance);
    	
    	
	}
    
  // IMPORTANT
}

// display function (pass by address)
void display(Admin *A,int size)
{
	int i;
    for(i=0; i<size; i++)
    {
    
    printf("\n--- Admin Details ---\n");
    printf("Admin ID is : %d\n",A[i].id);
    printf("Admin name is : %s\n",A[i].name);
    printf("Admin Salary is : %f\n", A[i].salary);
    printf("Admin Allowances is : %f\n", A[i].allowance);
    
    
	}
    
    
}




