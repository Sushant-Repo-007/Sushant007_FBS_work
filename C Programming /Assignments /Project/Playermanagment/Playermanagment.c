#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Player {
    int jerseyNo;
    char name[30];
    int runs;
    int wickets;
    int matches;
} Player;

Player *players;
int count = 0;
int size;

/* Function Declarations */
void addPlayer();
void removePlayer();
void searchPlayer();
void updatePlayer();
void displayAll();
void sortByRuns();
void sortByWickets();
void top3Players();

/* Main Function */
void main() {
    int choice;

    printf("Enter initial number of players: ");
    scanf("%d", &size);
 
    players = (Player *)malloc(size * sizeof(Player));
    if (players == NULL) {
        printf("Memory allocation failed!\n");
    
    }

    do {
        printf("\n===== PLAYER MANAGEMENT SYSTEM =====\n");
        printf("1. Add Player\n");
        printf("2. Remove Player\n");
        printf("3. Search Player\n");
        printf("4. Update Player Data\n");
        printf("5. Display All Players\n");
        printf("6. Sort Players by Runs\n");
        printf("7. Sort Players by Wickets\n");
        printf("8. Display Top 3 Players\n");
        printf("9. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
        case 1: addPlayer(); break;
        case 2: removePlayer(); break;
        case 3: searchPlayer(); break;
        case 4: updatePlayer(); break;
        case 5: displayAll(); break;
        case 6: sortByRuns(); break;
        case 7: sortByWickets(); break;
        case 8: top3Players(); break;
        case 9: printf("Exiting program...\n"); break;
        default: printf("Invalid choice!\n");
        }
    } while (choice != 9);

    free(players);
    
}
void addPlayer() {
    if (count >= size) {
        printf("Player limit reached!\n");
        return;
    }

    printf("Enter Jersey Number: ");
    scanf("%d", &players[count].jerseyNo);

    printf("Enter Player Name: ");
    scanf("%s", players[count].name);

    printf("Enter Runs: ");
    scanf("%d", &players[count].runs);

    printf("Enter Wickets: ");
    scanf("%d", &players[count].wickets);

    printf("Enter Matches Played: ");
    scanf("%d", &players[count].matches);

    count++;
    printf("Player added successfully!\n");
}
void removePlayer() {
    int jersey, i, j;
    printf("Enter Jersey Number to remove: ");
    scanf("%d", &jersey);

    for (i = 0; i < count; i++) {
        if (players[i].jerseyNo == jersey) {
            for (j = i; j < count - 1; j++)
                players[j] = players[j + 1];

            count--;
            printf("Player removed successfully!\n");
            return;
        }
    }
    printf("Player not found!\n");
}
void searchPlayer() {
    int choice, jersey;
    char name[30];
	int i;
    printf("Search by:\n1. Jersey Number\n2. Name\n");
    scanf("%d", &choice);

    if (choice == 1) {
        printf("Enter Jersey Number: ");
        scanf("%d", &jersey);

        for (i = 0; i < count; i++)
            if (players[i].jerseyNo == jersey) {
                printf("%s | Runs: %d | Wickets: %d | Matches: %d\n",
                       players[i].name, players[i].runs,
                       players[i].wickets, players[i].matches);
                return;
            }
    } else {
        printf("Enter Name: ");
        scanf("%s", name);

        for (i = 0; i < count; i++)
            if (strcmp(players[i].name, name) == 0) {
                printf("Jersey: %d | Runs: %d | Wickets: %d | Matches: %d\n",
                       players[i].jerseyNo, players[i].runs,
                       players[i].wickets, players[i].matches);
                return;
            }
    }
    printf("Player not found!\n");
}
void updatePlayer() {
    int jersey;
    printf("Enter Jersey Number to update: ");
    scanf("%d", &jersey);
	int i;
    for (i = 0; i < count; i++) {
        if (players[i].jerseyNo == jersey) {
            printf("Enter new Runs: ");
            scanf("%d", &players[i].runs);

            printf("Enter new Wickets: ");
            scanf("%d", &players[i].wickets);

            printf("Enter new Matches: ");
            scanf("%d", &players[i].matches);

            printf("Player updated successfully!\n");
            return;
        }
    }
    printf("Player not found!\n");
}
void displayAll() {
    if (count == 0) {
        printf("No players available!\n");
        return;
    }
	int i;
    printf("\nJersey\tName\tRuns\tWickets\tMatches\n");
    for (i = 0; i < count; i++)
        printf("%d\t%s\t%d\t%d\t%d\n",
               players[i].jerseyNo,
               players[i].name,
               players[i].runs,
               players[i].wickets,
               players[i].matches);
}
void sortByRuns() {
    Player temp;
    int i,j;
    for (i = 0; i < count - 1; i++)
        for (j = i + 1; j < count; j++)
            if (players[i].runs < players[j].runs) {
                temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
    displayAll();
}

void sortByWickets() {
    Player temp;
    int i,j;
    for (i = 0; i < count - 1; i++)
        for ( j = i + 1; j < count; j++)
            if (players[i].wickets < players[j].wickets) {
                temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
    displayAll();
}

void top3Players() {
    if (count < 3) {
        printf("Not enough players!\n");
        return;
    }
	int i;
    sortByRuns();
    printf("\nTop 3 Players by Runs:\n");
    for ( i = 0; i < 3; i++)
        printf("%s - %d Runs\n", players[i].name, players[i].runs);

    sortByWickets();
    printf("\nTop 3 Players by Wickets:\n");
    for (i = 0; i < 3; i++)
        printf("%s - %d Wickets\n", players[i].name, players[i].wickets);
}

