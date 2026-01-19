////checks whether a character is printable.
////checLetters (A–Z, a–z)
//
//Digits (0–9)
//
//Symbols (! @ # $ % etc.)
//
//Space ' 'ks whether a character is printable.


#include <stdio.h>
#include <ctype.h>

void main() {
    char ch = '\n';

    if(isprint(ch))
        printf("Printable\n");
    else
        printf("Not printable\n");

   
}

