//It searches a string for the first occurrence of ANY character from a given set of characters.
#include <stdio.h>
#include <string.h>

void main()
{
	char str[] = "abc@123";
	char special[] = "@#$%";

	char *p = strpbrk(str, special);

	if (p)
    printf("Special character found: %c", *p);
    
    
    

//str1 ? main string (where to search)
//
//str2 ? set of characters to find
//
//Return value:
//
//Returns a pointer to the first matching character in str1
//
//Returns NULL if no character is found

//#include <stdio.h>
//#include <string.h>
//
//int main()
//{
//    char str1[] = "hello123";
//    char str2[] = "0123456789";
//
//    char *ptr = strpbrk(str1, str2);
//
//    if (ptr != NULL)
//        printf("First match: %c", *ptr);
//    else
//        printf("No match found");
//
//    return 0;
//}
//


	
}

