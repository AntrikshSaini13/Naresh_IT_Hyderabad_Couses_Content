
// Q-6  Write a C program that prompts the user to enter a number and then prints the multiplication table for that number using a while loop.

// Ans ->

#include<stdio.h>
int main(){
    
    int num, i=1 ;
    printf("Enter the number \n");
    scanf("%d",&num);
    printf("The table of %d\n\n",num);
    while(i <=10){
        printf("%d * %d = %d\n\n",num,i,num*i);
        i++;
    }
    return 0;
}