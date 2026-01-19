#include<stdio.h>
typedef  struct  Book{
	char name[20];
	char author[20];
	int  price;
	
	
}Book;

void store(struct Book *b,int size);
void Display(struct Book *b,int size);
// variable decalaration
void main()
{
	 struct Book b1[2];  //structure variable
	int size=2;
	
	
	store(b1,size); // parameter passses here 
	Display(b1,size); // parameter passes here 
	
} //main ends here 
void store(struct Book *b,int size) //recieved here 
{
	int i;
	for(i=0; i<size; i++)
	{
		printf("Enter the Book name :");
		scanf("%s",b[i].name);
		
		printf("Enter author name:");
		scanf("%s",b[i].author);
		
		printf("Enter the Price:");
		scanf("%d",&b[i].price);	
		
	}
	
}
void Display(struct Book *b,int size)
{
	int i;
	for(i=0; i<size; i++)
	{
		printf("The Book name is :%s",b[i].name);
		printf("The author name is:%s",b[i].author);
		printf("The Price is :%d",b[i].price);
	
		
	}	
	
	
	
}
