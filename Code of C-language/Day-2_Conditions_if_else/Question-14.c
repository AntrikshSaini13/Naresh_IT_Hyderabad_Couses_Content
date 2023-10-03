// Write a C program to find the profit and loss on user given cost price and selling price.



// Input as : 

// Enter Cost price :  1000

// Enter Selling price : 1500



// Output as : 

// The profit is : Rs.500

// The profit percentage is : 50%
#include<stdio.h>
int main() {
    int cost, sell, profit;
    printf("Enter the cost price\n");
    scanf("%d",&cost);
    printf("Enter the selling price\n");
    scanf("%d",&sell);
    profit = sell -cost;
    
    
    printf("The profit is : %d\nThe profit percentage is : %d\n" ,profit , profit*100/cost );
    
    
    return 0;
}