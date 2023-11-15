//pointer to pointer / double pointer

#include<stdio.h>
void main(){
    int a=100,*p,**q,***r;
    p=&a;
    q=&p;
    r=&q;
    printf("a value = %d\n*p value = %d\n**q value = %d\n***r value = %d\n",a,*p,**q,***r);
    printf("a addres = %d\n*p address = %d\n**q address = %d\n***r address = %d",&a,p,q,r);
}