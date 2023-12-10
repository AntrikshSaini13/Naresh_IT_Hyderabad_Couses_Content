// (Develop below program using switch case)

// Write a C program that will read a float and a character from console. The character could be d for deposit or w for withdrawal.

// Starting with a balance of 2000.

// *Ask the user to initialize the balance and don't allow 0 and -ve values if it is 0 or -ve then print "Ammount Can't be stored".

// *If the user want deposit operation then ask how much ammount he want to deposit and add that ammount

//  with balance and print the balance.

// *if the user want withdrwal operation then ask how much ammount he want to withdrwal and substract that 

//  ammount from the balance and print the balance.

// [Note: If the deposit ammount is negetive or 0 print "Invalid ammount".

//     If the withdrawl ammount is negetive , 0 or greater than balance then print "Invalid ammount"]

// Hints:

// -------

// Declare variables for the amount in float, balance in float and transaction code in char types.

// Test the transaction code, if ‘d’ it is deposit. Test the ammount so that it is not negative.

// If the balance is not negative or positive sum-up

// the balance.

// balance = balance + amount;

// Test the transaction code for withdrawal, ‘w’. If the transaction code is ‘w’

// Minus the withdrawn amount to update the

// balance.

// balance = balance - amount;

// And print the balance.


#include<stdio.h>
int main(){
    int amount,num;
    float bal = 2000;
    printf("Select the Options\n\nDepoist Ammount \t\t1\nWithdrawal Amount\t\t2\n");
    scanf("%d",&num);
    switch(num){
        case 1: 
            printf("For Deposit\nEnter the Deposit amount of our account\t[     ]\b\b\b\b\b\b");
            scanf("%d",&amount);
            bal+=amount;
            printf("Deposit ammount is %d\n",amount);
            printf("After deposit Balance is \n\n%.2f",bal);
            break;
        case 2:
            if (bal > 0){
                printf("For withdwarl\nEnter the withdwral amount of our account\t[     ]\b\b\b\b\b\b");
                scanf("%d",&amount);
                bal-=amount;
                printf("\nwithdwral ammount is %d\n",amount);
                if (bal > 0) {
                    printf("\nAfter withdwral balance is \n\n%.2f ",bal);
                }
                else {
                    printf("After withdrawl Insufficent balance %.2f",bal);
                }
            }
            else {
                printf("Insufficent balance");
            }
            break;
        default : printf("Invalid input");
    }
}
