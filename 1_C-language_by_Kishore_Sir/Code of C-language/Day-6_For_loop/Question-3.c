// Write a program in C to display the multiplication table for a given integer. 

// Test Data :

// Input the number (Table to be calculated) : 15

// Expected Output :

// 15 X 1 = 15

// ...

// ...

// 15 X 10 = 150 
#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void main(){
    int num,i,j;
    printf("Enter the number\n");
    scanf("%d",&num);
    system("cls");
    for(i=1;i<=10;i++){
        if(i < 2 || 9 < i)printf("%d %c %d = %d\n",num,120,i,num*i);
        else printf("-------------\n");
    }  
}