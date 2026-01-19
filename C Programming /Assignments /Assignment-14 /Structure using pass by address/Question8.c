#include <stdio.h>
// structure definition
typedef struct Distance
{
    int feet;
    float inch;
}Distance;

// function declarations
void store(Distance *d,int size);
void display(Distance *d,int size);

void main()
{
    struct Distance d1[2];
	int size=2;
    // receive returned structure
    store(d1,size);

    display(d1,size);


}

// function to store distance values
void store(Distance *d,int size)
{
	
	int i;
	for(i=0; i<size; i++)
	{
	printf("Enter Distance Details\n");

    printf("Enter Feet: ");
    scanf("%d", &d[i].feet);

    printf("Enter Inches: ");
    scanf("%f", &d[i].inch);
	}

}

// function to display distance
void display(Distance *d,int size)
{
	int i;
	for(i=0; i<size;i++)
	{
		printf("\n--- Distance Details");
        printf("The feet is :%d",d[i].feet);
    	printf("Enter Inches:%f ",d[i].inch);
    	
	}
	
}
