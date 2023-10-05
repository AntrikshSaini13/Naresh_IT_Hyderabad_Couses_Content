// Write a C program to determine the eligibility for marriage based on specific criteria. The program checks the nationality India as (I or i) 
// gender, and age of an individual and provides a response regarding their eligibility for marriage.
// Conditions:
// ----------------
// * The program is designed for Indian citizens only.
// * If the person is an Indian citizen, the program prompts for their gender.
// * For males, the program asks for their age and checks if it falls between 21 and 50 (inclusive). 
//  If so, it displays a message stating that "Congratulation! you are eligible for marriage".
//  If not, it must display a message stating that "Sorry! you are not eligible for marriage".
// * For females, the program asks for their age and checks if it falls between 18 and 45 (inclusive). 
//  If so, it displays a message stating that "Congratulation! you are eligible for marriage".
//  If not, it must display a message stating that "Sorry! you are not eligible for marriage".
// * If the person is not an Indian citizen, the program displays a message stating that the eligibility
// check is only for Indian citizens.
// * Your task is to write a C program that implements the above conditions to determine the eligibility for marriage.
// Instructions:
// ------------------
// * Implement the program using the C programming language.
// * Use suitable variable names and data types for the program.
// * Display appropriate messages to guide the user through the input process.
// * Assume that the user will provide valid inputs.
// * Test your program with different inputs to ensure its correctness.


#include <stdio.h>
#include <string.h>
int main() {
    int age ;
    char gender[11],national[21],name[20];
    printf("Enter the national of india [india/INDIA]\n");
    scanf("%s",national);
    if(strcmp(national,"indian")==0 || strcmp(national,"INDIAN")==0 )
    {
        printf("Enter the name and age and Gender for male [MALE/male] for female[FEMALE/female]\n");
        scanf("%s %d %s",name,&age,gender);
        if((strcmp(gender,"male")==0 || strcmp(gender,"MALE")==0 )&& (age >= 21 && age <= 50))
        {
            printf("\"%s\" Congratulation! you are eligible for marriage",name);
        }
        else if((strcmp(gender,"female")==0 || strcmp(gender,"FEMALE")==0 )&& (age >= 18 && age <= 45))
        {
            printf("\"%s\" Congratulation! you are eligible for marriage",name);
        }
        else{
            printf("\"Sorry! you are not eligible for marriage\"");
        }
    }
    else
    {
        printf("Enter the valid input plz ");
    }
    return 0;
}
