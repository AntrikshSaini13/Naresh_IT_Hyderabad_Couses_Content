#include<stdio.h>
void main(){
    int a,b,*p,*q;
    p=&a;
    q=&b;
    printf("Enter the value = ");
    scanf("%d %d",&*p,&*q);
    puts(*p>*q?"A is Bger":*q>*p?"B is Biger":"Both are is Equal");
}