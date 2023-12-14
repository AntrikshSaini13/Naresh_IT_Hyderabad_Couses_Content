// Write a program in C to read n number of values in an array and display it in reverse order.

// Input the number of elements to store in the array :3

// Input 3 number of elements in the array :

// element - 0 : 2

// element - 1 : 5

// element - 2 : 7

// Expected Output :

// The values store into the array are :

// 2 5 7

// The values store into the array in reverse are :

// 7 5 2

#include<stdio.h>
int main(){
    //write your code here...
    int a[]={1,5,3,4,9,6,11,8};
    for(int i=0;i<8;i++)
    {
        // printf("%4d\n",a[i]);
        for(int j=0;j<8;j++)
        {
            if(a[i]<a[j])
            // printf("%4d\n",a[j]);
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
    }
    for(int i=0;i<8;i++)
    {
        printf("%4d",a[i]);
    }
    
    return 0;
}