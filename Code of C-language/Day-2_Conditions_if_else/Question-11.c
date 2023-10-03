// Write a C program that takes an hour in the 24-hour format as input and identifies the time of day as "Morning," "Afternoon," "Evening," or "Night." Implement this using a series of if statements. Ensure that the program also checks for invalid input, displaying an appropriate message if the entered hour is not within the valid range (0-23). Present the program with a suitable title and header for clarity.



// Input as :

// Enter the hour (24-hour format): 13



// Output as :

// It's Afternoon.

#include <stdio.h>

int main() {
    float time;
    printf("Enter the value");
    scanf("%f",&time);
    
    if(time > 1 && time <= 5){
        printf("Nigth");
    }
    if(time > 5  && time <= 12){
        printf("morning");
    }
    if(time > 12 && time <= 18 ){
        printf("Evening");
    }
    if(time > 18  && time <= 24){
        printf("Evening");
    }

    return 0;
}