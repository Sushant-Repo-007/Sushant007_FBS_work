//with  returntype and without  parameter 
#include<stdio.h>
int Greaternumber(); //function declaration 
void main()
{
	int res;
	res=Greaternumber(); // function calling  
	if(res==1)
	{
		 printf("Greatest = %d\n", res);
		
	}else if(res==2){
		
		 printf("Greatest = %d\n", res);
	}else if(res==3){
		
		 printf("Greatest = %d\n", res);
	}else if(res==4){
		  printf("Greatest = %d\n", res);
		
	}
}
int Greaternumber() //function called 
{
 int a = 25;   // hardcoded number 1
    int b = 40;   // hardcoded number 2
    int c = 15;   // hardcoded number 3

    if (a > b) {
        if (a > c) {
           return 1;
        } else {
           return 2;
        }
    } else {
        if (b > c) {
           return 3;
        } else {
          return 4;
        }
    }
}
