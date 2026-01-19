
#include <stdio.h>
#include <string.h>


//converts all uppercase letters in a string to lowercase.
//sometimes it is called as strlwr a

 void main()
{
    char str[20];
    printf("Enter the string here:");
	scanf("%s",str);
    strlwr(str);

    printf("%s", str);
    

}

