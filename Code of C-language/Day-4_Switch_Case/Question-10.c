// Write a C program to take user Id as 1001 and Pasword as 1010. Ask the user to enter his id, if the id is valid 

// then ask the user to enter his password ,if the password is correct then print the name of the user, otherwise 

// the program will print incorrect Passoword and if the Id doesnot exits, the program will print Incorrect Id.

// develop this program by using Switch case. 


#include<stdio.h>
int main(){
    int num1, num2;
    char name[10];
    printf("Enter the your name plz\n");
    scanf("%s",name);
    printf("Enter the uour id plz\n");
    scanf("%d",&num1);
    printf("Enter the your passward plz\n");
    scanf("%d",&num2);
    switch(num1 == 1001 && num2==1000){
        case 1:printf("Welcome\t%s",name);
            break;
        case 0 : printf("Incorrect passward");
            break;
        default : printf("Invalid");
            break;
    }
    return 0;
}