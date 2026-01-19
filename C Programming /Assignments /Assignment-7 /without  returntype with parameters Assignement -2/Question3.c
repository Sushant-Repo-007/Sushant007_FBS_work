//without  returntype and with parameter 
#include<stdio.h>
void Greaternumber(int,int ,int); //function declaration with parameters passed 
void main()
{
	int a = 25;   // hardcoded number 1
    int b = 40;   // hardcoded number 2
    int c = 15;   // hardcoded number 3
	
	Greaternumber(a,b,c); // function calling  
}
void Greaternumber(int x ,int y,int z) //function called
{
 

    if (x > y) {
        if (x>z) {
            printf("Greatest = %d\n", x);
        } else {
            printf("Greatest = %d\n", z);
        }
    } else {
        if (y > z) {
            printf("Greatest = %d\n", y);
        } else {
            printf("Greatest = %d\n", z);
        }
    }
}
