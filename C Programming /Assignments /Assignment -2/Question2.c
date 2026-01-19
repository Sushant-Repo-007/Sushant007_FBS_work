#include <stdio.h>

int main() {
    int a = 10;   // hardcoded side 1
    int b = 10;   // hardcoded side 2
    int c = 5;    // hardcoded side 3

    // First check if triangle is valid
    if (a + b > c && a + c > b && b + c > a) {

        if (a == b && b == c) {
            printf("It is an Equilateral Triangle\n");
        }
        else if (a == b || b == c || a == c) {
            printf("It is an Isosceles Triangle\n");
        }
        else {
            printf("It is a Scalene Triangle\n");
        }

    } else {
        printf("Invalid Triangle\n");
    }

    return 0;
}

