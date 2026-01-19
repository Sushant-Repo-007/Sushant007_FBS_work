#include <stdio.h>
// structure definition
typedef struct Complex
{
    float real;
    float imaginary;
}Complex;

// function declarations
void store(Complex *c,int size);
void display(Complex *c,int size);

void main()
{
    struct Complex c1[2];
    int size=2;

    // receive returned structure
    store(c1,size);

    display(c1,size);


}

// function to store complex number values
void store(Complex *c,int size)
{
	int i;
	for(i=0; i<size; i++)
	{
		printf("Enter Complex Number Details\n");

    	printf("Enter Real Part: ");
    	scanf("%f", &c[i].real);

    	printf("Enter Imaginary Part: ");
    	scanf("%f", &c[i].imaginary);
		
		
	}
   
}

// function to display complex number
void display(Complex *c,int size)

{
		int i;
		for(i=0; i<size; i++)
		{
					
   			printf("\n--- Complex Number ---\n");
    		printf("Real Part      : %.f\n", c[i].real);
    		printf("Imaginary Part : %.f\n", c[i].imaginary);
			
		}

}

