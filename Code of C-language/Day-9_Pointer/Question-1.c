#include<stdio.h>
void main(){
    int a=100;//variable decleration as wel as inistalize
    int *p;//pinter declare 
    p=&a;//pointer inistailize
    printf("a value is %d\n",a);//this os giving value of 'a'
    printf("a address is %d\n",&a);//this is giving the addres of a variable '&a'
    printf("p value is %d\n",p);//p having a address of a
    printf("*p value is %d\n\n",*p);//*p is point the value of a

    *p=300;
    printf("the value of p = %d\nand *p = %d\nand a = %d\nand &a = %d\n\n",p,*p,a,&a);

    a=200;
    printf("the value of p = %d\nand *p = %d\nand a = %d\nand &a = %d\n",p,*p,a,&a);

    // getch();
}