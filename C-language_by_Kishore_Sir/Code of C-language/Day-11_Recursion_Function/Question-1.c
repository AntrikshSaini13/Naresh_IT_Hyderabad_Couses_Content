/*
Write a program in C to print the first 50 natural numbers using recursion.

Expected Output:

 The natural numbers are : 1  2  3
  4  5  6  7  8  9  10  11  12  13
  14  15  16  17  18  19  20  21  
22  23  24  25  26  27  28  29  30
  31  32  33  34  35  36  37  38  
39  40  41  42  43  44  45  46  47
  48  49  50 

*/
#include <stdio.h>
int i=0;
void ArrayElement(int arr1[100], int str, int len);
void ArrayElement(int arr1[100], int str, int len)
{
    printf("Elements: %d, len: %d\n",str,arr1[str]);
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

