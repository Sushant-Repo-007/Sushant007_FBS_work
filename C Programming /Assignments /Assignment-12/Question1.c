#include <stdio.h>

int main()
{
    char str[20];
    char ch;
    int i = 0;

    printf("Enter the string: ");
    scanf("%s", str);

    printf("Enter the character to search: ");
    scanf(" %c", &ch);

    while (str[i] != '\0')
    {
        if (str[i] == ch)
        {
            printf("Character '%c' found at position %d", ch, i);
            return 0;
        }
        i++;
    }

    printf("Character not found");
    return 0;
}

