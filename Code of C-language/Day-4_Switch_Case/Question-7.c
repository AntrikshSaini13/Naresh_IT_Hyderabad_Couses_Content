// Write a C program to accept id from user and display department.

// Id: 11 to 15 is Software department

// 16 to 20 is Developer department

// 21 to 23 is Management department


#include<stdio.h>
int main()
{
    int num;
    printf("Enter the number \n");
    scanf("%d",&num);
    
    switch(num){
        case 11 ... 15:
        printf("Software department");
        break;
        case 16 ... 20:
        printf("Developer  department");
        case 21 ... 23:
        break;
        printf("Management department");
        break;
    }
    return 0;
}