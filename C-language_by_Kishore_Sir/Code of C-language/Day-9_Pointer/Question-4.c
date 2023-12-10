/*
 Write a program in C to store n elements in an array and print the elements using a pointer.

Test Data :

Input the number of elements to store in the array :5

Input 5 number of elements in the array :

element - 0 : 5

element - 1 : 7

element - 2 : 2

element - 3 : 9

element - 4 : 8

Expected Output :



 The elements you entered are :                                        

 element - 0 : 5                                                

 element - 1 : 7                                                

 element - 2 : 2                                                

 element - 3 : 9                                                

 element - 4 : 8 
*/

#include<stdio.h>
int main() {
    int array[10],i,*p,num;
    p=&array[0];  //p=&array[],p=&array
    puts("Enter the number of array = ");
    scanf("%d",&num);
    printf("Enter the array elements ");
    for(i=0;i<num;i++)
        scanf("%d",&array[i]);
    for(i=0;i<num;i++){
        printf("array[%d] = %d\n",i,p[i]);
    }
return 0;    
}