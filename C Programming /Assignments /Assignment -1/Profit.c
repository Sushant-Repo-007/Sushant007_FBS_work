#include <stdio.h>

void main()
{
    int cost_price = 100, selling_price = 200;
    int profit, loss;

    if (selling_price > cost_price)
    {
        profit = selling_price - cost_price;
        printf("The profit is: %d", profit);
    }
    else if (cost_price > selling_price)
    {
        loss = cost_price - selling_price;
        printf("There is a loss: %d", loss);
    }
    else
    {
        printf("No profit, no loss");
    }


}

