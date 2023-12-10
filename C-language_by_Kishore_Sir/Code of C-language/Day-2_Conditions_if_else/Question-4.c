// Write a C program for checking the person is eligible for marraige
// or not by following few Requirement 

// Req 1:- Person should be of Indian Nationality 
// Req 2:- Person have to tell their gender and then based on the gender logic will 
//         be execute
// Req 3:-If "MALE"   age should be greater than 21 or less than 65.
// Req 4:-If "Female" age should be greter  than 18 or less than 60.

// If the Person is eligible show the message as
// "You are eligible for marriage but think twice".
// else
// "You are not eligible for marriage live freely".
#include<stdio.h>
#include<string.h>
void main()
{
    char gender;
    char national[11];
    int age1 , age2;
    printf("Enter the Nationality (indian/INDIAN)\n");
    scanf("%s",&national);
    printf("Enter the age female\n");
    scanf("%d",&age1);
    printf("Enter the age male\n");
    scanf("%d",&age2);
    if((strcmp(national,"indian")==0 || strcmp(national,"INDIAN")==0 )&&(age1 >18 && age1 <= 60 )&& (age2 >21 && age2 <= 65 )){
        printf("You are eligible for marriage but think twice");
    }
    else{
        printf("You are not eligible for marriage live freely");
    }
  
}