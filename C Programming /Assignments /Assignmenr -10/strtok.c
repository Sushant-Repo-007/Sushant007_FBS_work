#include <stdio.h>
#include <strings.h> 

//Split string into tokens
void  main() 
{
	char str[] = "I love C programming";
	char *token = strtok(str, " ");
	
	
		while(token) 
	{
    	printf("%s\n", token);
    	token = strtok(NULL, " ");
	}

  
}

