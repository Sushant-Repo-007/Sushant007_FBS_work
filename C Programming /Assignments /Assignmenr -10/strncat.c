#include <stdio.h>
#include <string.h>

//It concatenates (appends) a specific number of characters from one string to another.
void  main() 
{
    char str1[20] = "Hello, ";
    char str2[] = "World!";

    strncat(str1, str2, 3); // append only first 3 chars of str2

    printf("%s\n", str1);  // Output: Hello, Wor

}

