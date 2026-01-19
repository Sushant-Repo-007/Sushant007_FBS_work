#include <stdio.h>

void print(int arr[],int);   // function declaration (pointer parameter)

void main()
{
	int size;
	int i;		
	printf("Enter the size of of the array");
	scanf("%d",&size);
	
	
	printf("Enter the array  elements");
	int arr[5];
	for(i=0; i<size; i++)
	{	
	scanf("%d",&arr[i]);
	}
    		print(arr ,size);    // function calling (pass address)
}

void print(int arr[],int size)   // function definition
{
    int i = 1;

    while (arr[i] <= size)
    {
        printf("The numbers in the range: %d\n", arr[i]);
        i++;
    }
}

