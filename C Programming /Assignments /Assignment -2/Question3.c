#include <stdio.h>

void main() {
    int a = 25;   // hardcoded number 1
    int b = 40;   // hardcoded number 2
    int c = 15;   // hardcoded number 3

    if (a > b) {
        if (a > c) {
            printf("Greatest = %d\n", a);
        } else {
            printf("Greatest = %d\n", c);
        }
    } else {
        if (b > c) {
            printf("Greatest = %d\n", b);
        } else {
            printf("Greatest = %d\n", c);
        }
    }


}

