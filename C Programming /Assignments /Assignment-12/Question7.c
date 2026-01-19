// WAP to Remove the Characters of Odd Index Values in a String
#include <stdio.h>

int main()
{
    char str[20];
    int i = 0, j = 0;

    printf("Enter the string here: ");
    scanf("%s", str);

    for (i = 0; str[i] != '\0'; i++)
    {
        if (i % 2 == 0)   // keep even index characters
        {
            str[j] = str[i];
            j++;
        }
    }
    str[j] = '\0';   // terminate string after loop

    printf("The resulting value is: %s", str);

    return 0;
}

