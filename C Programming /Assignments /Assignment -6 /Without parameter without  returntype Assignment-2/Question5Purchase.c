//without  returntype and without parameter 
#include<stdio.h>
void PurchaseandDiscount(); //function declaration 
void main()
{
	PurchaseandDiscount(); // function calling  
}
void PurchaseandDiscount() //function called 
{
	char Student = 'y';   // hardcoded: 'y' or 'n'
    int purchase = 550;     // hardcoded purchase amount
    float discount;

    if ( Student == 'y' || Student == 'Y') {
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
