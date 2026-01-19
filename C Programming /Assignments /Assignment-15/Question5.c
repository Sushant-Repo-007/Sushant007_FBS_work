#include<stdio.h>
typedef struct Moviedatabase{
	char title[20];
	char director[20];
	int releaseyear;
	char genre[20];
	

}Moviedatabase;

void userinput(Moviedatabase *M, int *count, int size);
void search(Moviedatabase *M, int);
void update(Moviedatabase *M, int);
void Display(Moviedatabase *M, int);


void main()
{
	struct Moviedatabase M1[10]; //created an structure array  of 10 movies  here 
	int size=10;
	int choice;
	int count=0;

	do
	{
		printf("1. Userinput\n");
		printf("2.Search\n");
		printf("3.Update\n");
		printf("4.Display\n");
		printf("5.Exit\n");	
					
		printf("Enter the choice here :");
		scanf("%d",&choice);				
					
					
		switch(choice)
		{
			
			case 1:
				userinput(M1,&count,size);	
			break;
			
			case 2:
					search(M1,count);
			break;			
			
			case 3:
					update(M1,count);
			break;
			
			case 4:
					Display(M1,count);			
			break;
			
			case 5:
				printf("5.Exiting The Program\n");
			break;	
			
			default:
				printf("Please enter the valid choice:");		
		
										
		}	
		
						
							
		
	}
	while(choice!=5);		
		
}
void userinput(Moviedatabase *M, int *count, int size)
{
    if (*count >= size) {
        printf("Database full!\n");
        return;
    }

    printf("Enter movie title: ");
    scanf("%s", M[*count].title);

    printf("Enter director name: ");
    scanf("%s", M[*count].director);

    printf("Enter genre: ");
    scanf("%s", M[*count].genre);

    printf("Enter release year: ");
    scanf("%d", &M[*count].releaseyear);

    (*count)++;
    printf("Movie added successfully!\n");
}
void search(Moviedatabase *M, int count)
{
    char searchTitle[20];
    int i, found = 0;

    printf("Enter movie title to search: ");
    scanf("%s", searchTitle);

    for(i = 0; i < count; i++) {
        if(strcmp(M[i].title, searchTitle) == 0) {
            printf("\nTitle: %s", M[i].title);
            printf("\nDirector: %s", M[i].director);
            printf("\nGenre: %s", M[i].genre);
            printf("\nRelease Year: %d\n", M[i].releaseyear);
            found = 1;
            break;
        }
    }

    if(!found) {
        printf("Movie not found!\n");
    }
}
void update(Moviedatabase *M, int count)
{
    char oldTitle[20];
    int i;

    printf("Enter old movie title to update: ");
    scanf("%s", oldTitle);

    for(i = 0; i < count; i++)
    {
        if(strcmp(M[i].title, oldTitle) == 0)
        {
            printf("Enter new movie title: ");
            scanf("%s", M[i].title);

            printf("Enter new director name: ");
            scanf("%s", M[i].director);

            printf("Enter new genre: ");
            scanf("%s", M[i].genre);

            printf("Enter new release year: ");
            scanf("%d", &M[i].releaseyear);

            printf("Movie updated successfully!\n");
            return;
        }
    }

    printf("Movie not found!\n");
}
void Display(Moviedatabase *M, int count)
{
    int i;

    if(count == 0) {
        printf("No movies in database!\n");
        return;
    }

    for(i = 0; i < count; i++) {
        printf("\nTitle: %s", M[i].title);
        printf("\nDirector: %s", M[i].director);
        printf("\nGenre: %s", M[i].genre);
        printf("\nRelease Year: %d\n", M[i].releaseyear);
    }
}

