//memchr() is a memory-search function used to find the first occurrence of a byte (character) in a block of memory.

#include <stdio.h>
#include <string.h>

//a memory-search function used to find the first occurrence of a byte (character) in a block of memory.

void  main()
{
    char data[] = {'A','B','\0','C','D'};

    char *p = memchr(data, '\0', 5);

    if(p)
        printf("Null byte found at index %ld", p - data);
    else
        printf("Not found");

	
}

