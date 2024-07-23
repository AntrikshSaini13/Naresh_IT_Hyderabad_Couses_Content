// Write a C program to input amount from user and print minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, 1) required for the amount. How to the minimum number of notes required for the given amount in C programming. Program to find minimum number of notes required for the given denomination. Logic to find minimum number of denomination for a given amount in C program
// Input as :
// Enter the amount: 1275
// Output as :
// Rs. 500 notes: 2
// Rs. 100 notes: 2
// Rs. 50 notes: 1
// Rs. 20 notes: 1
// Rs. 10 coins: 0
// Rs. 5 coins: 1
// Rs. 2 coins: 0
// Rs. 1 coins: 0

#include<stdio.h>
#include<string.h>
void main()
{
    int money,pin,i=3;
    start:
    printf("Enter the ATM pin []\b\b");scanf("%d",&pin);
    if(pin == 1254) {
        printf("Enter the amount you want \n");scanf("%d",&money);
        if (money / 500){printf("500 note - %d\n",money/500);}
        money %= 500;
        if (money / 200){printf("200 note - %d\n",money/200);}
        money %= 200;
        if (money / 100){printf("500 note - %d\n",money/100);}
        money %= 100;
        if (money / 50){printf("50 note - %d\n",money/50);}
        money %= 50;
        if (money / 20){printf("20 note - %d\n",money/20);}
        money %= 20;
        if (money / 10){printf("10 note - %d\n",money/10);}
        money %= 10;
        if (money / 5){printf("5 note - %d\n",money/5);}
        money %= 5;
        if (money / 2){printf("2 note - %d\n",money/2);}
        money %= 2;
        if (money / 1){printf("1 note - %d\n",money);}

        printf("Collect Your Ammount Plz");
    }
    else {
        printf("Enter the valid pin ");
        i--;
        goto start;
    }
}