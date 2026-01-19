#include <stdio.h>

typedef struct product {
    char name[20];
    float price;
    int quantity;
} product;

void add(product *p, int size, int *count);
float calculate(product *p, int count);
void display(product *p, int count);

int main()
{
    product p1[10];
    int choice;
    int count = 0;
    float total;

    do {
        printf("\n1. Add items");
        printf("\n2. Display items");
        printf("\n3. Calculate total price");
        printf("\n4. Exit");
        printf("\nEnter the choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                add(p1, 10, &count);
                break;

            case 2:
                display(p1, count);
                break;

            case 3:
                total = calculate(p1, count);
                printf("Total price: %.2f\n", total);
                break;

            case 4:
                printf("Exiting program...\n");
                break;

            default:
                printf("Invalid choice!\n");
        }
    } while(choice != 4);

    return 0;
}
void add(product *p, int size, int *count)
{
    if (*count >= size) {
        printf("Cart is full!\n");
        return;
    }

    printf("Enter product name: ");
    scanf("%s", p[*count].name);

    printf("Enter price: ");
    scanf("%f", &p[*count].price);

    printf("Enter quantity: ");
    scanf("%d", &p[*count].quantity);

    (*count)++;
    printf("Product added successfully!\n");
}

float calculate(product *p, int count)
{
    float total = 0;
    int i;

    for(i = 0; i < count; i++) {
        total += p[i].price * p[i].quantity;
    }
    return total;
}

void display(product *p, int count)
{
    int i;

    if (count == 0) {
        printf("Cart is empty!\n");
        return;
    }

    for(i = 0; i < count; i++) {
        printf("Product: %s | Price: %.2f | Quantity: %d\n",
               p[i].name, p[i].price, p[i].quantity);
    }
}

