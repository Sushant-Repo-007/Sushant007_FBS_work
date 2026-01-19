#include <stdio.h>

void main() {
    char Student = 'y';   // hardcoded: 'y' or 'n'
    int purchase = 550;     // hardcoded purchase amount
    float discount;

    if ( Student == 'y' || isStudent == 'Y') {
        if (purchase > 500) {
            discount = purchase * 0.20;
        } else {
            discount = purchase * 0.10;
        }
    } else {
        if (purchase > 600) {
            discount = purchase * 0.15;
        } else {
            discount = 0;   // no discount
        }
    }

    printf("Purchase Amount: %d\n", purchase);
    printf("Discount: %.2f\n", discount);


}

