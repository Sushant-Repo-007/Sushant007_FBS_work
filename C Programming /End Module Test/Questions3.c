//Develop  a program, to manage a music library.define a structure to store song details (song Id ,title,artist,and duration),create menu  driven  program to add new
// Add new songs and display  the song libray use functions to handle these operations


#include <stdio.h>
#include <string.h>

#define MAX 100   // maximum number of songs

// Structure definition
struct Song {
    int songId;
    char title[50];
    char artist[50];
    float duration;   // duration in minutes
};

// Function declarations
void addSong(struct Song songs[], int *count); // fubnction add 
void displaySongs(struct Song songs[], int count); // function display 


void main()
{
    struct Song songs[MAX];
    int count = 0;
    int choice;

    do
    {
        printf("\n--- Music Library Menu ---\n");
        
        
        printf("1. Add New Song\n");
        printf("2. Display Songs\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                addSong(songs, &count);
                break;

            case 2:
                displaySongs(songs, count);
                break;

            case 3:
                printf("Exiting program...\n");
                break;

            default:
                printf("Invalid choice! Try again.\n");
        }
    } while(choice != 3);
}

// Function to add a new song
void addSong(struct Song songs[], int *count)
{
    printf("\nEnter Song ID:\n ");
    scanf("%d", &songs[*count].songId);

    printf("Enter Song Title:\n ");
    scanf(" %[^\n]", songs[*count].title);

    printf("Enter Artist Name:\n ");
    scanf(" %[^\n]", songs[*count].artist);

    printf("Enter Duration (in minutes):\n ");
    scanf("%f", &songs[*count].duration);

    (*count)++;

    printf("Song added successfully!\n"); // message displayed songs addess successfully 
}

// Function to display all songs
void displaySongs(struct Song songs[], int count)
{
    int i;
    if(count == 0)
    {
        printf("\nNo songs in the library.\n");
    }

    printf("\n--- Song Library ---\n");
    for(i = 0; i < count; i++) // loop iterated to display the song count 
    {
        printf("\nSong %d\n", i + 1);
        printf("ID       : %d\n", songs[i].songId);
        printf("Title    : %s\n", songs[i].title);
        printf("Artist   : %s\n", songs[i].artist);
        printf("Duration : %.f minutes\n", songs[i].duration);
    }
}
	
