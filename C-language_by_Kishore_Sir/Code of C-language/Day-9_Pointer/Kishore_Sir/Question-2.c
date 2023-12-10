#include<stdio.h>
void main(){
    int a,*p=&a;
    printf("Enter the value of ");
    scanf("%d",&*p);
    // scanf("%d",*&p);
    // scanf("%d",&a);
    printf("a = %d\n*p = %d\n",a,*p);
    printf(*p%2?"Odd":"Even");
}