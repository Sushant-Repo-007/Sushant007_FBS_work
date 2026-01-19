#include <stdio.h>
#include <strings.h> 



void  main() 
{

	char str1[] = "Programming";
    char str2[] = "programmer";

    if(strncasecmp(str1, str2, 7) == 0)
        printf("First 7 characters match (ignore case)\n");
    else
        printf("First 7 characters do not match\n");
  
}

