/*
Write a program in C to print the array elements using recursion. 

Test Data :

Input the number of elements to be stored in the array :6

Input 6 elements in the array :

element - 0 : 2

element - 1 : 4

element - 2 : 6

element - 3 : 8

element - 4 : 10

element - 5 : 12

Expected Output :

The elements in the array are : 2  4  6  8  10  12 
*/

#include <stdio.h>
int i=0;
void ArrayElement(int arr1[100], int str, int len);
void ArrayElement(int arr1[100], int str, int len)
{
    printf("Elements: %d -> %d\n",str,arr1[str]);
    if(str!=len) ArrayElement(arr1,str+=1,len);
}
int main()
{
    int arr[100],num1=0,num2,i,j;
    puts("Enter the lenght of array");
    scanf("%d",&num2);
    for(i=1,j=0;i<=num2*2;i++)
        if(i%2==0){
            arr[j]=i;
            j++;
        }
    ArrayElement(arr,num1,--j);
    return 0;
}