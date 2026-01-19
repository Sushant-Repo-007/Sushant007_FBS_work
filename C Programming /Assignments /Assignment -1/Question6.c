#include<stdio.h>

	void main()
	{
	char ch='a';
	
	if(ch>='A'&& ch<='Z' || ch>='a' && ch<='z') 
	{
//		ch=ch+32;
		printf("This is an Uppercase letter %c:",ch);
	}
	else
	{
		printf("This is an Lowercase letter %c: ",ch);
	}
	}
