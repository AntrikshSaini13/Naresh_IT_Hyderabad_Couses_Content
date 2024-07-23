// Write a program in C to print separately the  odd and even integers 

// Test Data :

// Input the number of elements to be stored in the array :5

// Input 5 elements in the array :

// element - 0 : 25

// element - 1 : 47

// element - 2 : 42

// element - 3 : 56

// element - 4 : 32

// Expected Output :

// The Even elements are :

// 42 56 32

// The Odd elements are :

// 25 47


#include<stdio.h>
int main(){
    int array[100],i,num;
    printf("Enter the number between 1-100 = ");
    scanf("%d",&num);
    
    printf("Insert the Array element \n");
    for(i=0;i<num;i++)
        scanf("%d",&array[i]);
    printf("\nEven\n");
    for(i=0;i<num;i++){
        // printf("array[%d] = %d\n",i,array[i]);
        if(array[i] % 2==0) printf("array[%d] = %d\n",i,array[i]);
    }
    printf("\nOdd\n");
    for(i=0;i<num;i++){
        if(array[i] % 2) printf("array[%d] = %d\n",i,array[i]);
    }
    return 0;
}