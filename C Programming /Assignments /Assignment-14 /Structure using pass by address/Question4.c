#include<stdio.h>

typedef struct HR{

	int id;
	char name[20]; 
	float salary;
	float commission;
} HR;

// function declarations
void store( HR *H,int size);
void display( HR *H,int size);

void main()
{
	struct HR H[2];
	int size=3;
	store(H,size); //passed parameter
	display(H,size);
}
void store(HR *H,int size) // recived here 
{
   int i;
   for(i=0; i<size; i++)
   {
   	
   	 printf("\nEnter HR  details:\n");

    	printf("Enter the HR  ID: ");
    	scanf("%d",&H[i].id);

    	printf("Enter the HR  name: ");
    	scanf("%s",H[i].name);

    	printf("Enter the HR  Salary: ");
    	scanf("%f", &H[i].salary);
    
    	printf("Enter the HR Comission: ");
    	scanf("%f", &H[i].commission);
   	  	
   	
   }
    
      // IMPORTANT
}

// display function (pass by value)
void display (HR *H,int size)
{
    int i;
    for(i=0; i<size; i++)
    {
    	
  	  	printf("\n--- HR  Details ---\n");
    	printf("HR  ID is : %d\n",H[i].id);
    	printf("HR  name is : %s\n",H[i].name);
    	printf("HR  Salary is : %f\n", H[i].salary);
    	printf("HR Commission is : %f\n", H[i].commission);
    
    
	}
    
    
}




