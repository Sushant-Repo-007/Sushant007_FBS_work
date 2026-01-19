#include <stdio.h>
#include <string.h>

void main()
{
    
    char str[20];
    char ch;
    
    printf("Enter the string here:\n");
    scanf("%s",str);
    
    printf("Enter the charcater:");
    scanf("%c",&ch);
    
   
    char *ptr = strchr(str, 'ch');

    if(ptr != NULL) //  here we take  found the character till null terminator 
        printf("Character found: %c\n", *ptr);
        
    else
        printf("Character not found");

//	Here charcter vale is found until till null terminator as of result is found and not found here 
	

}

