#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void main(){
    int num,i,j;
    printf("Enter the number\n");
    scanf("%d",&num);
    system("clr");
    for(i=1;i<=10;i++){
        if(i < 2 || 9 < i)printf("%d * %d = %d\n",num,i,num*i);
        else printf("---------\n");
    }  
}