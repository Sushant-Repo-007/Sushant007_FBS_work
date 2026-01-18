#include <stdio.h>

int main() {
    int totalMinutes = 150; 
    int hours;
    int remainingMinutes;

    
    hours = totalMinutes / 60;

    remainingMinutes = totalMinutes % 60;

    printf("%d minutes is equal to %d hours and %d minutes.\n", totalMinutes, hours, remainingMinutes);

    return 0;
}
