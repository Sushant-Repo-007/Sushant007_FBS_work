#include <stdio.h>
//with returntype and withput  parameters
float PurchaseandDiscount();   // function declaration

int main()
{
    float dis;
    dis = PurchaseandDiscount();   // function calling

    printf("Discount = %.2f\n", dis);
    return 0;
}

float PurchaseandDiscount()   // function definition
{
    char student;
    int purchase;
    float discount;

    printf("Are you a student? (y/n): ");
    scanf(" %c", &student);   // space before %c is important

    printf("Enter purchase amount: ");
    scanf("%d", &purchase);

    if (student == 'y' || student == 'Y')
    {
        if (purchase > 500)
            discount = purchase * 0.20;
        else
            discount = purchase * 0.10;
    }
    else
    {
        if (purchase > 600)
            discount = purchase * 0.15;
        else
            discount = 0;
    }

    return discount;   // returning value
}

