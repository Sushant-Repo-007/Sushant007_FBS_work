//WAP to Take in a String and Replace Every Blank Space with special symbol.
// WAP Replace all Occurrences of ‘a’ with $ in a String
#include <stdio.h>

char* replace(char *str, char oldchar, char newchar);

int main()
{
    char str[20] = "This is a string";
	
    char*result =replace(str, ' ', '#');
		printf(" The string is found :%s",result);
    return 0;
}

char* replace(char *str, char oldchar, char newchar)
{
    int i = 0;

    while (str[i] != '\0')
    {
        if (str[i] == oldchar)
        {
            str[i] = newchar;
        }
        i++;
    }
	return str;
    
}

