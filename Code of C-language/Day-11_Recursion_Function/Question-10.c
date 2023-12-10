/*
Write a program in C to get the largest element of an array using recursion. 

Test Data :

Input the number of elements to be stored in the array :5

Input 5 elements in the array :

element - 0 : 5

element - 1 : 10

element - 2 : 15

element - 3 : 20

element - 4 : 25

Expected Output :

Largest element of an array is: 25 
*/

#include<stdio.h>
int temp,i=0;
void isLargestNum(int arr[100], int str, int len, int len_arr);
void isLargestNum(int arr[100], int str, int len, int len_arr){
    
    //for sorting perpose
    for(i=0;i<len_arr;i++)
        if(arr[str]<arr[i]){
            temp=arr[str];
            arr[str]=arr[i];
            arr[i]=temp;
        }
    //recursion
    if(str!=len)
        isLargestNum(arr,++str,len,len_arr);
}

int main()//caller
{
    int array[100], start_arr=0, end_arr, len_array;
    
    puts("Enter the ELnth of array");
    scanf("%d",&end_arr);
    
    len_array=end_arr;
    
    puts("Enter five array elements");
    for(i=0;i<end_arr;i++)
        scanf("%d",&array[i]);
    
    //callie
    isLargestNum(array, start_arr, --end_arr, len_array);
    
    //print sorted array assending order
    for(int i=0;i<len_array;i++)
        printf("array -> %d\n",array[i]);
    
    //print largest element of array
    printf("Largest element of an array is: %d",array[--len_array]);
    return 0;
}