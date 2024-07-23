// Program to swap all elements of two integer arrays using user define function in C.

// Input as :

// Enter array size : 6

// Enter 6 elements for 1st array : 1 2 3 4 5 6

// Enter 6 elements for 2nd array : 7 8 9 0 1 2



// Output as :

// After swapping :

// 1st array : 7 8 9 0 1 2

// 2nd array : 1 2 3 4 5 6



#include <stdio.h>

void displayArray(int array1[], int array2[], int size);
void swapArrays(int arr1[], int arr2[], int size) ;

// Function to swap the contents of two integer arrays
void swapArrays(int arr1[], int arr2[], int size) {
    int temp[100];
    //write your code here...
    puts("Enter the arrat1 elements");
    for(int i=0;i<size;i++)
        scanf("%d",&arr1[i]);
        
    puts("Enter the array2 elements");
    for(int j=0;j<size;j++)
        scanf("%d",&arr2[j]);
    
    // for swap Array 
    for(int i=0;i<size;i++)
    {
        temp[i]=arr1[i];
        arr1[i]=arr2[i];
        arr2[i]=temp[i];
    }
    displayArray(arr1,arr2,size);
}

// Function to display the contents of an integer array
void displayArray(int array1[], int array2[], int size) {
    puts("Array 1 with swap");
    for(int i=0;i<size;i++)
        printf("%4d",array1[i]);
    puts("\nArray 2 with swap");
    for(int i=0;i<size;i++)
        printf("%4d",array2[i]);
}

int main() {
    int array1[100],array2[100],size;
    puts("Enter the size of array1 and arrray2");
    scanf("%d",&size);
    swapArrays(array1,array2,size);
//write your code here...
    return 0;
}