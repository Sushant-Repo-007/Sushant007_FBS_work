#include <stdio.h>
#include <string.h>
#include <locale.h>
//compares strings using locale rules,
//but it is slow when used repeatedly (e.g., sorting thousands of strings)
void  main() {
    setlocale(LC_COLLATE, "");  // set system locale

    char s1[] = "apple";
    char s2[] = "banana";

    if(strcoll(s1, s2) < 0) {
        printf("apple comes before banana\n");
    }

   
}

