////mystrcasecmp
//strcasecmp() is a string comparison function in C.
//
//It compares two strings ignoring case (case-insensitive).

#include <stdio.h>
#include <strings.h>  // for strcasecmp

int main() {
    char str1[] = "Hello";
    char str2[] = "HELLO";

    if(strcasecmp(str1, str2) == 0) {
        printf("Strings are equal (ignoring case)\n");
    } else {
        printf("Strings are not equal\n");
    }

    return 0;
}

