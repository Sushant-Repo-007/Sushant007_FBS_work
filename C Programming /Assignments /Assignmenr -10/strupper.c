#include <stdio.h>
#include <string.h>

//converts uppercase letters to lowercase letters therefore we can say that 

 void main()
{
    char str[20];
    printf("Enter the string here:");
	scanf("%s",str);
    strupr(str);

    printf("%s", str);

}

