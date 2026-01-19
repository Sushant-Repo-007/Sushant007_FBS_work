#include <stdio.h>

void Greaternumber(int arr[], int brr[], int crr[] ,int size); // function declaration with pointers

void main()
{
	
		int i;
		int arr[5]={10,20,30,40,50};
		int brr[5]={10,20,30,40,50};
		int crr[5]={10,20,30,40,50};
		int  size=5;
//    int a = 25;   // hardcoded number 1
//    int b = 40;   // hardcoded number 2
//    int c = 15;   // hardcoded number 3

//    int *p = &a;
//    int *q = &b;
//    int *r = &c;

    Greaternumber(arr, brr, crr ,size); // function calling
}

void Greaternumber(int arr[], int brr[], int crr[],int size) // function definition
{
	int i;
	for(i=0; i<size; i++)
	{
	
    if (arr[i] > brr[i])
    {
        if (arr[i] > crr[i])
        {
            printf("Greatest = %d\n", arr[i]);
        }
        else
        {
            printf("Greatest = %d\n", crr[i]);
        }
    }
    else
    {
        if (brr[i] > crr[i])
        {
            printf("Greatest = %d\n", brr[i]);
        }
        else
        {
            printf("Greatest = %d\n",crr[i]);
        }
    }
}
}

