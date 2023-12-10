/*
Write a program in C to swap elements using call by reference.

Test Data :

Input the value of 1st element : 5

Input the value of 2nd element : 6

Input the value of 3rd element : 7

Expected Output :



The value before swapping are :                                        

element 1 = 5                                                 

element 2 = 6                                                 

element 3 = 7                                                 

                                                       

The value after swapping are :                                        

element 1 = 7                                                 

element 2 = 5                                                 

element 3 = 6 


*/
#include<stdio.h>
void swap(int *a, int *b, int *c){
    int t;
    t=*a;
    *a=*c;
    *c=*b;
    *b=t;
    
}
void main(){
    int a,b,c;
    puts("Enter the value of a and b");
    scanf("%d %d %d",&a,&b,&c);
    printf("Before the swaping number %d %d %d\n",a,b,c);
    swap(&a,&b,&c);
    printf("After swaping number = %d %d %d\n",a,b,c);
}