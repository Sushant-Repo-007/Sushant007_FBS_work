#include <stdio.h>
// structure definition
typedef struct Time
{
    int hour;
    int min;
    int sec;
}Time;

// function declarations
void store(Time *t,int);
void display(Time *t,int);

void main()
{
    struct Time t1[2];
	int size=2;
    // receive returned structure
    store(t1,size);

    display(t1,size);

  
}

void store(Time *t,int size)
{
	
	int i;
		for(i=0; i<size; i++)
	{
		 printf("Enter Time Details\n");

  	  	printf("Enter Hours: ");
    	scanf("%d", &t[i].hour);

    	printf("Enter Minutes: ");
    	scanf("%d", &t[i].min);

    	printf("Enter Seconds: ");
    	scanf("%d", &t[i].sec);
		
		
	}
   			

    	
}

// function to display time
void display(Time *t,int size)
{
	int i;
	for(i=0; i<size; i++)
	{
		printf("\n--- Time Details ---\n");
    	printf("Hour : %d\n", t[i].hour);
    	printf("Min  : %d\n", t[i].min);
    	printf("Sec  : %d\n", t[i].sec);
	
	}

}

