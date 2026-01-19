#include <stdio.h>
// structure definition
typedef struct Date
{
    int date;
    int month;
    int year;
}Date;

// function declarations (pass by value)
void store(Date *d,int size);
void display( Date *d,int size);

void main()
{
    struct Date d1[2];
	int size=2;
    // receiving returned structure
    store(d1,size);

    display(d1,size);


}

// function to store date values
void store(Date *d,int size)
{
	int i;
	for(i=0; i<size; i++)
	{
	
	 printf("Enter Date Details\n");

    printf("Enter Date: ");
    scanf("%d", &d[i].date);

    printf("Enter Month: ");
    scanf("%d", &d[i].month);

    printf("Enter Year: ");
    scanf("%d", &d[i].year);

		
	}
}

// function to display date
void display(Date *d,int size)
{
	
	int i;	
	for(i=0; i<size; i++)
{	
	printf("\n--- Date Details ---\n");
    printf("Date  : %d\n", d[i].date);
    printf("Month : %d\n", d[i].month);
    printf("Year  : %d\n", d[i].year);
}
		
	
}
