#include <stdio.h>

// structure definition
typedef struct Product
{
		    int id;
		    char name[20];
		    int quantity;
		    float price;
}Product;

// function declarations
void store(struct Product *p,int size);
void display(struct Product *p,int size);

void  main()
{
		    struct Product p1[2];
			int size=2;
		   
		    store(p1,size);
		
		    display(p1,size);

}

// function to store product details
void store(Product *p,int size)
{
	
	int i;
	for(i=0; i<size; i++)
	{
			printf("Enter Product Details\n");
		    printf("Enter Product ID:");
		    scanf("%d", &p[i].id);
		
		    printf("Enter Product Name:");
		    scanf("%s", p[i].name);
		
		    printf("Enter Quantity: ");
		    scanf("%d", &p[i].quantity);
		
		    printf("Enter Price: ");
		    scanf("%f", &p[i].price);
	
	}	
   
}

// function to display product details
void display(Product *p,int size)
{
	int i;
	for(i=0; i<size; i++)
	{
			
		    printf("\n--- Product Details ---\n");
		    printf("ID       : %d\n", p[i].id);
		    printf("Name     : %s\n", p[i].name);
		    printf("Quantity : %d\n", p[i].quantity);
		    printf("Price    : %f\n", p[i].price);
		
	}

}

