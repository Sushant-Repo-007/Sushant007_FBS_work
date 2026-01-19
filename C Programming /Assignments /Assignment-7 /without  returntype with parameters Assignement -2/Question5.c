//without  returntype and with  parameter 
#include<stdio.h>
void PurchaseandDiscount(char ,int ,float); //function declaration 
void main()
{
	char Student = 'y';   // hardcoded: 'y' or 'n'
    int purchase = 550;     // hardcoded purchase amount
    float discount;
    
	PurchaseandDiscount( Student,purchase,discount); // function calling  
}
void PurchaseandDiscount(char Student ,int purchase, float discount) //function called 
{
	

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
