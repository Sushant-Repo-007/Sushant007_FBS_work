#include <stdio.h>

void table(int Tables[], int size);   // function declaration

void main()
{	
    int Tables[] = {1,2,3,4,5,6,7,8,9,10};
    int size = 10;

    table(Tables, size);    // function call
}

// function definition
void table(int Tables[], int size)
{
    int i, j;

    for(i = 0; i < size; i++)
    {
        printf("\nTable of %d:\n", Tables[i]);

        for(j = 1; j <= 10; j++)
        {
            printf("%d x %d = %d\n", Tables[i], j, Tables[i] * j);
        }
    }
}

