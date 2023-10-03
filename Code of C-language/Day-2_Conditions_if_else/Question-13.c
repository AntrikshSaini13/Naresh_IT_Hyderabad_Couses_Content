// Write C program to check the person is eligible for marriage or not by following few requirements.

// 1) Person should be Indian represent by I or i

// 2) Person age should be above 21 and below 60 for male, where male is represented by M or m.

// 3) Person age should be above 18 and below 55 for male, where female is represented by F or f.

// If the above requirements are not fulfilled then show a status i.e "Not eligible for marriage". Develop the program by using if and else.

#include<stdio.h>
#include<string.h>
int main()
{
    char gender_f,gender_m;
    char national[12];
    int age1 , age2;
    printf("Enter the Nationality (indian/INDIAN)\n");
    scanf("%s",national);
    printf("Enter the age female as well as gernder(F) \n");
    scanf("%d %c",&age1,&gender_f);
    printf("Enter the age male as well as gernder(M)\n");
    scanf("%d %c",&age2,&gender_m);
    if((strcmp(national,"indian")==0 || strcmp(national,"INDIAN")==0) && age1 >18 && age1 <= 55 && age2 >21 && age2 <= 65 && (gender_m == 'M' || gender_m == 'm') && (gender_f == 'f' || gender_f == 'F'))
    {
        printf("You are eligible for marriage but think twice");
    }
    else{
        printf("You are not eligible for marriage live freely");
    }
    return 0;
  
}