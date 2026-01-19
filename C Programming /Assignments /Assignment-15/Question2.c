#include <stdio.h>

struct Time {
    int hrs;
    int min;
    int sec;
};

/* Function declarations */
struct Time acceptTime();
void displayTime(struct Time t);
struct Time addTime(struct Time t1, struct Time t2);
int toSeconds(struct Time t);

void main()
{
    struct Time t1, t2, sum;
    int totalSeconds;

    printf("Enter first time:\n");
    t1 = acceptTime();

    printf("\nEnter second time:\n");
    t2 = acceptTime();

    printf("\nFirst Time: ");
    displayTime(t1);

    printf("\nSecond Time: ");
    displayTime(t2);

    sum = addTime(t1, t2);

    printf("\n\nAfter Addition:");
    displayTime(sum);

    totalSeconds = toSeconds(sum);
    printf("\nTotal time in seconds = %d\n", totalSeconds);


}

/* Accept time */
struct Time acceptTime()
{
    struct Time t;
    printf("Enter hours: ");
    scanf("%d", &t.hrs);
    printf("Enter minutes: ");
    scanf("%d", &t.min);
    printf("Enter seconds: ");
    scanf("%d", &t.sec);
    return t;
}

/* Display time */
void displayTime(struct Time t)
{
    printf("%d:%d:%d", t.hrs, t.min, t.sec);
}

/* Add two time values */
struct Time addTime(struct Time t1, struct Time t2)
{
    struct Time t;

    t.sec = t1.sec + t2.sec;
    t.min = t1.min + t2.min;
    t.hrs = t1.hrs + t2.hrs;

    /* Carry handling */
    if (t.sec >= 60)
    {
        t.min += t.sec / 60;
        t.sec = t.sec % 60;
    }

    if (t.min >= 60)
    {
        t.hrs += t.min / 60;
        t.min = t.min % 60;
    }

    return t;
}


/* Convert time to seconds */
int toSeconds(struct Time t)
{
    return (t.hrs * 3600) + (t.min * 60) + t.sec;
}

