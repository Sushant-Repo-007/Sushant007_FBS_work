//Print a pattern of stars in diamond shape
#include <stdio.h>

void main() {
    
	int i,j;
    int n;
	printf("Print a pattern of stars in diamond shape\n");  //question 
	printf("Please enter the input  size:");
	scanf("%d",&n); //taking user input  from the user 							
		// Upper half
    for(i = 1; i <= n; i++) {
        for(j = 1; j <= i; j++) {
            printf("* ");
        }
        printf("\n");
    }

  		  // Lower half
    for(i = n - 1; i >= 1; i--) {
        for(j = 1; j <= i; j++) {
            printf("* ");
        }
        printf("\n");
    }

}

