// Write a program in C to swap two numbers using a function.

// Test Data :

// Input 1st number : 2

// Input 2nd number : 4

// Expected Output :



// Before swapping: n1 = 2, n2 = 4                          

// After swapping: n1 = 4, n2 = 2 



#include <stdio.h>

// Function to swap two numbers
void swap(int *num1, int *num2) {
    //Write Your Code Here...
    int temp;
    temp = *num1;
    *num1 = *num2;
    *num2 = temp;
    puts("After swapping");
    printf("n1 = %d n2 = %d\n",*num1,*num2);  
}

int main(){
    //Write Your Code Here...
    int num1, num2;
    puts("Enter the two number");
    scanf("%d %d",&num1,&num2);
    puts("Before swapping");
    printf("n1 = %d n2 = %d\n",num1,num2); 
    swap(&num1,&num2);
    puts("After swapping");
    printf("n1 = %d n2 = %d\n",num1,num2);
    return 0;
}