#include<stdio.h>
void main(){
    char name[7][100]={"Aman","Prachi","Mayank Ji","Advit","Mr Satish","Mrs Anita"};
    char n[10]="aman";
    int i;
    puts("Name");
    puts("***********************************************************************");
    puts(n);
    for(i=0;i<7;i++)
        puts(name[i]);
}