//Print a hollow square pattern

#include <stdio.h>

void main() {
 
	int i,j;
    int n;
	printf("Print a hollow square pattern\n");  //question 
	printf("Please enter the input  size:");
	scanf("%d",&n); //taking user input  from the user 	   

    for( i = 1; i <= n; i++) {
        for( j = 1; j <= n; j++) {
            if(i == 1 || i == n || j == 1 || j == n)
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");
    }


}

