#include <stdio.h>
#include <string.h>
#include <locale.h>
//strxfrm() transforms a string into a form suitable for locale-based comparison


void  main() {
    setlocale(LC_COLLATE, "");

    char src[] = "apple";
    char dest[50];

    strxfrm(dest, src, sizeof(dest));

    printf("Original: %s\n", src);
    printf("Transformed: %s\n", dest);

}

