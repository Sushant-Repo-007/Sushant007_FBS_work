#include <stdio.h>

void Totalsalary(float arr[], int size);   // function declaration

void main()
{
    float salary[10];
    int size, i;

    printf("Enter how many employees: ");
    scanf("%d", &size);

    printf("Enter the salaries:\n");
    for(i = 0; i < size; i++)
    {
        scanf("%f", &salary[i]);
    }

    Totalsalary(salary, size);   // function call
}

/* Function definition */
void Totalsalary(float arr[], int size)
{
    int i;
    float da, ta, hra, total_salary;

    for(i = 0; i < size; i++)
    {
        if (arr[i] <= 5000)
        {
            da  = arr[i] * 0.10;
            ta  = arr[i] * 0.20;
            hra = arr[i] * 0.25;
        }
        else
        {
            da  = arr[i] * 0.15;
            ta  = arr[i] * 0.25;
            hra = arr[i] * 0.30;
        }

        /* LOGIC SAME AS ORIGINAL PROGRAM */
        total_salary = da + ta + hra;

        printf("Employee %d Total Salary = %.2f\n", i + 1, total_salary);
    }
}

