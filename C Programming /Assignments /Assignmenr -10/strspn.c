#include <stdio.h>
#include <string.h>

int main()
{
    char str1[] = "abcde123";
    char str2[] = "abcde";

    int result = strspn(str1, str2);

    printf("Result = %d", result);
    return 0;
}

