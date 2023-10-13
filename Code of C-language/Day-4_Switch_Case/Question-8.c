// Write a C program that will ask for a person’s name and his/her game score. Then it will ask for a second person’s name and score. The program will print the winner’s name and also print by how many 

// points that person won by comparing the scores. Develop this program by using switch case.

#include<stdio.h>
int main()
{
    int num1, num2; 
    char name1[10],name2[10];
    printf("Enter the name first person and scroe\n");
    scanf("%s %d",name1,&num1);
    printf("Enter the name Second person and scroe\n");
    scanf("%s %d",name2,&num2);
    
    switch(num1>num2){
        case 1:printf("Winer %s",name1);
        break;
        case 0 :printf("winer %s",name2);
        break;
    }
    return 0;
}