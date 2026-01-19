//t duplicates a string by allocating memory dynamically for the new string.
//String to duplicate
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void  main() {
    char str1[] = "Hello World";
    char *str2;

    str2 = strdup(str1); // Duplicate str1

    if(str2 != NULL) {
        printf("Original: %s\n", str1);
        printf("Duplicate: %s\n", str2);

        free(str2); // Free dynamically allocated memory
    } else {
        printf("Memory allocation failed\n");
    }

   
}

