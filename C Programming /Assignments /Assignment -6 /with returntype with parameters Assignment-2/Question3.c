//#with  returntye and with paprameter 
#include <stdio.h>

int Greaternumber(int, int, int);   // function declaration

void main()
{
    int a = 25;
    int b = 40;
    int c = 15;
    int res;

    res = Greaternumber(a, b, c);   // function calling

    printf("Greatest = %d\n", res);

}

int Greaternumber(int x, int y, int z)   // function definition
{
    if (x >= y && x >= z)
        return x;
    else if (y >= x && y >= z)
        return y;
    else
        return z;
}

