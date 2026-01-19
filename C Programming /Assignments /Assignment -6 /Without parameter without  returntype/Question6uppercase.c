#include<stdio.h>
void uppercaseandlowecase(); //declaration 
//without parameter without  returntype

void main(){
	
	 uppercaseandlowecase(); //function calling 
}

void uppercaseandlowecase() //function called 
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
