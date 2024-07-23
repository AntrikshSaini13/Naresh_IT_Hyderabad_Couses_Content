// Find the Largest Element: Create a program that finds the largest element in an array of integers. Implement separate functions for input, 
//finding the largest element, and main function to displaying the result.

// Input as : 

// Enter array size : 6

// Enter 6 elements : 5 6 3 6 7 9



// Output as : 

// The largest element is : 9

#include <stdio.h>

int findLargestElement(int arr[], int size);
int inputArray(int arr[], int size) {
    int i,j,temp;
    for(i=0;i<size;i++)
        for(j=0;j<size;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    return findLargestElement(arr,i);  
}
int findLargestElement(int arr[], int size) {  
    return arr[--size];   
}

int main() {
    
    //write your code here...n
    int array[100],size,i;
    puts("Enter the size of array");
    scanf("%d",&size);
    puts("Enter the array elements");
    for(i=0;i<size;i++){
        scanf("%d",&array[i]);
    }
    printf("The largest element is : %d",inputArray(array, size));
    return 0;
}