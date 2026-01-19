#include <stdio.h>
// structure definition
typedef struct SalesManager
{
    int id;
    char name[20];
    float salary;
    float incentive;
    int target;
}SalesManager;

// function declarations (pass by value)
void store( SalesManager *sm,int size);
void display( SalesManager *sm,int size);

void main()
{
    struct SalesManager sm1[2];
	int size=2;
	
    store(sm1,size);

    display(sm1,size);



}

// function to store values
 void store(SalesManager *sm,int size)
{
	int i;
	for(i=0; i<size; i++)
	
  {
  	  printf("Enter Sales Manager Details\n");

    printf("Enter ID: ");
    scanf("%d", &sm[i].id);

    printf("Enter Name: ");
    scanf("%s", sm[i].name);

    printf("Enter Salary: ");
    scanf("%f", &sm[i].salary);

    printf("Enter Incentive: ");
    scanf("%f", &sm[i].incentive);

    printf("Enter Target: ");
    scanf("%d", &sm[i].target);

  	
  	
  }
      
}

// function to display values
void display(SalesManager *sm,int size)
{
	int i;
	for(i=0; i<size; i++)
	{
		 printf("\n--- Sales Manager Details ---\n");
    printf("ID        : %d\n", sm[i].id);
    printf("Name      : %s\n", sm[i].name);
    printf("Salary    : %f\n", sm[i].salary);
    printf("Incentive : %f\n", sm[i].incentive);
    printf("Target    : %d\n", sm[i].target);
		
		
	}
   
}

