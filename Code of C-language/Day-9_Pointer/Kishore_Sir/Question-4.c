// Factoial nTH

#include<stdio.h>
void main(){
    int a,*p=&a;
    long f=1;
    printf("Enter the value = ");
    scanf("%d",&*p);
    while(*p>1){
        f*=*p;
        --*p;
    }
    printf("Factorial is = %d",f);
}