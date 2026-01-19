//n. mystrnstr
//Search for the first occurrence of a substring  in a string  but only up to n characters.
#include <stdio.h>
#include <string.h>

int main() {
    const char *haystack = "Hello World";
    const char *needle = "World";
    
    char *p = strnstr(haystack, needle, 11); // search first 11 chars

    if(p)
        printf("Found: %s\n", p);
    else
        printf("Not found\n");

    return 0;
}


