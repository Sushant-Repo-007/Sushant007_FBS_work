#include <stdio.h>
#include <string.h>

void main()
{
    char str1[] = "abcde123";
    char str2[] = "abcde";

    int result = strspn(str1, str2);

    printf("Result = %d", result);
    
//    here both the strings are compared such that 
//	and such how many characters are same in both strings that count of matched characters are given in int result.  
//   
}

