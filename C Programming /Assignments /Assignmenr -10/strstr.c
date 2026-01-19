#include <stdio.h>
#include <string.h>

void main() {
    char str[] = "sushant chorghe";
    char *ptr;

    ptr = strstr(str, "chorghe");

    if(ptr != NULL) {
        printf("Substring found at position: %ld\n", ptr - str);
    } else {
        printf("Substring not found");
    }

//    strstr is used to find the substring in the main string here example us wolrd 
}

