#include <stdio.h>

int main()
{
    char str1[7];
    int length = 0, i;

    printf("Enter source string: ");
    scanf("%s", str1);

    // Find length of string
    while (str1[length] != '\0')
    {
        length++;
    }

    printf("The reversed string is: ");

    // Print string in reverse
    for (i = length - 1; i >= 0; i--)
    {
        printf("%c", str1[i]);
    }

    return 0;
}

