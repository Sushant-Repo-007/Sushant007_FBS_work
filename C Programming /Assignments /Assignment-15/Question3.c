#include <stdio.h>

typedef struct {
    char name[20];
    int matches;
    int runs;
    int wickets;
} Player;

/* Function declarations */
void Accept(Player *p, int size);
void DisplayAll(Player *p, int size);
Player MaxRuns(Player *p, int size);
Player MaxWickets(Player *p, int size);

int main()
{
    Player p1[2];
    int size = 2;

    Accept(p1, size);
    DisplayAll(p1, size);

    Player maxRunPlayer = MaxRuns(p1, size);
    Player maxWicketPlayer = MaxWickets(p1, size);

    printf("\n\nPlayer with Maximum Runs:");
    printf("\nName: %s  Runs: %d", maxRunPlayer.name, maxRunPlayer.runs);

    printf("\n\nPlayer with Maximum Wickets:");
    printf("\nName: %s  Wickets: %d", maxWicketPlayer.name, maxWicketPlayer.wickets);

    return 0;
}

/* Accept player information */
void Accept(Player *p, int size)
{
    int i;
    for (i = 0; i < size; i++)
    {
        printf("\nEnter details of Player %d\n", i + 1);

        printf("Enter name: ");
        scanf("%s", p[i].name);

        printf("Enter matches played: ");
        scanf("%d", &p[i].matches);

        printf("Enter runs: ");
        scanf("%d", &p[i].runs);

        printf("Enter wickets: ");
        scanf("%d", &p[i].wickets);
    }
}

/* Display all players */
void DisplayAll(Player *p, int size)
{
    int i;
    printf("\n\n--- All Players Information ---\n");

    for (i = 0; i < size; i++)
    {
        printf("\nPlayer %d", i + 1);
        printf("\nName     : %s", p[i].name);
        printf("\nMatches  : %d", p[i].matches);
        printf("\nRuns     : %d", p[i].runs);
        printf("\nWickets  : %d\n", p[i].wickets);
    }
}

/* Find player with maximum runs */
Player MaxRuns(Player *p, int size)
{
    int i, maxIndex = 0;

    for (i = 1; i < size; i++)
    {
        if (p[i].runs > p[maxIndex].runs)
        {
            maxIndex = i;
        }
    }
    return p[maxIndex];
}

/* Find player with maximum wickets */
Player MaxWickets(Player *p, int size)
{
    int i, maxIndex = 0;

    for (i = 1; i < size; i++)
    {
        if (p[i].wickets > p[maxIndex].wickets)
        {
            maxIndex = i;
        }
    }
    return p[maxIndex];
}

