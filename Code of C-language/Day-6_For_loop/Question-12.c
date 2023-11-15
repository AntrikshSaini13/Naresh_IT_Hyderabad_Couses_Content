#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void main(){
    int num,i;
    printf("Enter the number\n");
    scanf("%d",&num);
    system("cls");
    for(i=1;i<=num;i++){
        printf("%d = %c  ",i,i);
    }  
}