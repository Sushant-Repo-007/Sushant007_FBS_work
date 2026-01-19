//with returntype and without  parameter 
#include<stdio.h>
int  Result(); //function declaration 
void main()
{
	int res;
	res=Result(); // function calling 
	
	if(res==1)
	{
	 printf("Distinction\n");	
	}else if(res==2) 
	{
		 printf("First Class\n");
	}else if(res==3) 
	{
		 printf("Second Class\n");
	}else if(res==4) 
	{
		printf("Pass Class\n");
	}
}
int Result() //function called 
{
	
	int marks;   
	printf("Enter the Marks\n ");
	scanf("%d",&marks);
	// hardcoded value

    if (marks > 75) {
       return 1;
    }
    else if (marks > 65) {
       return 2;
    }
    else if (marks > 55) {
       return 3;
    }
    else if (marks >= 40) {
        return 4;
    }
    else {
        printf("Fail\n");
    }

 
}
