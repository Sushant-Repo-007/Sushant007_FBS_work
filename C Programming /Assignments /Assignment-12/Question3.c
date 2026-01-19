// WAP to Remove the nth Index Character from a Non-Empty String
#include <stdio.h>
//WAP to Remove the nth Index Character from a Non-Empty String
void removeAtIndex(char str[], int n);

int main()
{
    char str[50];
    int n;

    printf("Enter the string: ");
  	scanf("%s",str);

    printf("Enter index to remove: ");
    scanf("%d", &n);

    removeAtIndex(str, n);

    printf("Resulting string: %s", str);

    return 0;
}

void removeAtIndex(char str[], int n)
{
    int i = 0;

    // find string length
    while (str[i] != '\0')
        i++;

    // if index is invalid
    if (n < 0 || n >= i)
    {
        printf("Invalid index\n");
        return;
    }

    // shift characters left
    for (i = n; str[i] != '\0'; i++)
    {
        str[i] = str[i + 1];
    }
}

