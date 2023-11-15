#include<stdio.h>
void main(){
    int a=10,b=12,c=30,*p[3],i;
    p[0]=&a;
    p[1]=&b;
    p[2]=&c;
    for(i=0;i<3;i++){
        printf(" %4d",*p[i]);
    }
}