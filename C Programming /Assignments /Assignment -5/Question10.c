//Print a hollow square with diagonal pattern
#include <stdio.h>

void main() {
    int n;
    int i,j;
	printf("Print a hollow square  with daigonal pattern\n");  //question 
	printf("Please enter the input  size:");
	scanf("%d",&n); //taking user input  from the user 

    for(i = 1; i <= n; i++) {
        for(j = 1; j <= n; j++) {

            // Border or main diagonal
            if(i == 1 || i == n || j == 1 || j == n || i == j)
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");
    }

    
}

