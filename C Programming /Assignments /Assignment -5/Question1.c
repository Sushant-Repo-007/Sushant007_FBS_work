#include<stdio.h>
void main () //called function by the Operating system thats is main 
{
	int n;
	printf("Print a solid square pattern\n");  //question 
	printf("Please enter the input  size:");
	scanf("%d",&n); //taking user input  from the user 
	
	int i,j;
	for(i=0; i<n; i++) //rows
	{
			for(j=0; j<n; j++) //columns
		{
				printf("* ");
		}
			printf("\n");
			
	}

	
	
	
}
