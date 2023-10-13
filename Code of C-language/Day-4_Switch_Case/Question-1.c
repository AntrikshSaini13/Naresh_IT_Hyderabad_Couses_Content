// Write a C to take the value from the user as input the month number and print number of days in that month. Using switch statement.

#include<stdio.h>

int main() {
    
    int mon;
    printf("Enter the Number month\n");
    scanf("%d",&mon);
    
    switch(mon)
    {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12 : printf("31 Daay");break;
        case 2 : printf("28 and 29 Days");break;
        case 4: case 6: case 9: case 11 : printf("31 Days");break;
        default :printf("Invalid input");
    }
    return 0;
}