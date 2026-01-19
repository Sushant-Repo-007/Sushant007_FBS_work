#include <stdio.h>

void PurchaseandDiscount(char[], int[], float[], int); // function declaration

void main()
{
    int i, size = 5;

    char student[5];	
    int purchase[5];
    float discount[5];

    printf("Enter details for %d customers\n", size);

    for (i = 0; i < size; i++)
    {
        printf("\nCustomer %d\n", i + 1);

        printf("Is student (y/n): ");
        scanf(" %c", &student[i]);   // space before %c is important

        printf("Purchase amount: ");
        scanf("%d", &purchase[i]);
    }

    PurchaseandDiscount(student, purchase, discount, size); // function call
}

void PurchaseandDiscount(char student[], int purchase[], float discount[], int size)
{
    int i;

    for (i = 0; i < size; i++)
    {
        if (student[i] == 'y' || student[i] == 'Y')
        {
            if (purchase[i] > 500)
                discount[i] = purchase[i] * 0.20;
            else
                discount[i] = purchase[i] * 0.10;
        }
        else
        {
            if (purchase[i] > 600)
                discount[i] = purchase[i] * 0.15;
            else
                discount[i] = 0;
        }

        printf("\nCustomer %d\n", i + 1);
        printf("Purchase Amount: %d\n", purchase[i]);
        printf("Discount: %.2f\n", discount[i]);
    }
}

