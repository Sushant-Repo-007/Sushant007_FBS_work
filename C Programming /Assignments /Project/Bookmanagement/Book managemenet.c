#include<stdio.h>
#include<string.h>
#include<stdlib.h>
typedef struct Book{
	
	int Id;
	char name[10];
	char authorname[10];
	float price;
	int rating;
	char category[10];
	
}Book;
void addBook(Book *b, int *count, int size);
void removeBook(Book *b, int *count);
void searchBook(Book *b, int count);
void showAuthorBooks(Book *b, int count);
void showCategoryBooks(Book *b, int count);
void updateBook(Book *b, int count);
void sortBooks(Book *b, int count);
void displayAll(Book *b, int count);




// function declarations all above there are here 
void main()
{
	int size;
	printf("Enter the size of the Book we have to add :");
	scanf("%d",&size);
	
    Book *b1 = (Book *)malloc(size * sizeof(Book));
	int count = 0;
	int choice;

	
	
    do
    {
        printf("\n1.Add Book");
        printf("\n2.Remove Book");
        printf("\n3.Search Book");
        printf("\n4.Show Author Books");
        printf("\n5.Show Category Books");
        printf("\n6.Update Book");
        printf("\n7.Sort Books");
        printf("\n8.Display All");
        printf("\n9.Exit");

        printf("\nEnter choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1: addBook(b1, &count, size); break;
            case 2: removeBook(b1, &count); break;
            case 3: searchBook(b1, count); break;
            case 4: showAuthorBooks(b1, count); break;
            case 5: showCategoryBooks(b1, count); break;
            case 6: updateBook(b1, count); break;
            case 7: sortBooks(b1, count); break;
            case 8: displayAll(b1, count); break;
            case 9: printf("Exiting...\n"); break;
            default: printf("Invalid choice!\n");
        }
    } while(choice != 9);

	free(b1);
}

void addBook(Book *b, int *count, int size)
{
    if(*count >= size)
    {
        printf("Database full!\n");
        
    }

    printf("Enter Book ID: ");
    scanf("%d", &b[*count].Id);

    printf("Enter Book Name: ");
    scanf("%s", b[*count].name);

    printf("Enter Author Name: ");
    scanf("%s", b[*count].authorname);

    printf("Enter Price: ");
    scanf("%f", &b[*count].price);

    printf("Enter Rating: ");
    scanf("%d", &b[*count].rating);

    (*count)++;
    printf("Book added successfully!\n");
}


void removeBook(Book *b, int *count)
{
    int id, i, j;
    printf("Enter Book ID to remove: ");
    scanf("%d", &id);

    for(i = 0; i < *count; i++)
    {
        if(b[i].Id == id)
        {
            for(j = i; j < *count - 1; j++)
                b[j] = b[j + 1];

            (*count)--;
            printf("Book removed successfully!\n");
            return;
        }
    }
    printf("Book not found!\n");
}

void searchBook(Book *b, int count)
{
    int choice, id, i;
    char name[30];

    printf("1. Search by ID\n2. Search by Name\nEnter choice: ");
    scanf("%d", &choice);

    if(choice == 1)
    {
        printf("Enter Book ID: ");
        scanf("%d",&id);

        for(i = 0; i < count; i++)
            if(b[i].Id == id)
            {
                printf("Book: %s | Author: %s | Price: %.2f | Rating: %.1f\n",
                       b[i].name, b[i].authorname, b[i].price, b[i].rating);
                return;
            }
    }
    else
    {
        printf("Enter Book Name: ");
        scanf("%s", name);

        for(i = 0; i < count; i++)
            if(strcmp(b[i].name, name) == 0)
            {
                printf("Book: %s | Author: %s | Price: %.2f | Rating: %.1f\n",
                       b[i].name, b[i].authorname, b[i].price, b[i].rating);
                return;
            }
    }
    printf("Book not found!\n");
}
void showAuthorBooks(Book *b, int count)
{
    char author[30];
    int i, found = 0;

    printf("Enter Author Name: ");
    scanf("%s", author);

    for(i = 0; i < count; i++)
        if(strcmp(b[i].authorname, author) == 0)
        {
            printf("%s | %.2f | %.1f\n",
                   b[i].name, b[i].price, b[i].rating);
            found = 1;
        }

    if(!found)
        printf("No books found for this author!\n");
}
void showCategoryBooks(Book *b, int count)
{
    char category[20];
    int i, found = 0;

    printf("Enter Category: ");
    scanf("%s", category);

    for(i = 0; i < count; i++)
        if(strcmp(b[i].category, category) == 0)
        {
            printf("%s | %s | %.2f\n",
                   b[i].name, b[i].authorname, b[i].price);
            found = 1;
        }

    if(!found)
        printf("No books found in this category!\n");
}
void updateBook(Book *b, int count)
{
    int id, i;
    printf("Enter Book ID to update: ");
    scanf("%d", &id);

    for(i = 0; i < count; i++)
        if(b[i].Id == id)
        {
            printf("Enter new Price: ");
            scanf("%f", &b[i].price);

            printf("Enter new Rating: ");
            scanf("%f", &b[i].rating);

            printf("Book updated successfully!\n");
            return;
        }

    printf("Book not found!\n");
}
void sortBooks(Book *b, int count)
{
    int i, j, choice;
    Book temp;

    printf("1. Sort by Price\n2. Sort by Rating\nEnter choice: ");
    scanf("%d", &choice);

    for(i = 0; i < count - 1; i++)
        for(j = i + 1; j < count; j++)
        {
            if((choice == 1 && b[i].price > b[j].price) ||
               (choice == 2 && b[i].rating < b[j].rating))
            {
                temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
        }

    displayAll(b, count);
}
	
void displayAll(Book *b, int count)
{
    int i;
    if(count == 0)
    {
        printf("No books available!\n");
        return;
    }

    for(i = 0; i < count; i++)
        printf("%d | %s | %s | %s | %.2f | %.1f\n",
               b[i].Id, b[i].name, b[i].authorname,
               b[i].category, b[i].price, b[i].rating);
}
	
	
	
	


