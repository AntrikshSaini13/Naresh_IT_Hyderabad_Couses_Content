/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]

Output: [1,2,4]

Explanation: The array represents the integer 123.

Incrementing by one gives 123 + 1 = 124.

Thus, the result should be [1,2,4].

Example 2:

Input: digits = [9,9,9]

Output: [1,0,0,0]

Explanation: The array represents the integer 999.

Incrementing by one gives 999 + 1 = 1000.

Thus, the result should be [1,0,0,0].

Example 3:

Input: digits = [4,3,2,1]

Output: [4,3,2,2]

Explanation: The array represents the integer 4321.

Incrementing by one gives 4321 + 1 = 4322.

Thus, the result should be [4,3,2,2].8*/




#include<stdio.h>
#include<stdlib.h>
void large_integer(int *a,int size){
    int j,i,sum=0,sum2,div;
    for(i=0;i<size;i++)
        sum= sum *10 + a[i];
    sum2= ++sum;

    // for count digits
    for(j=0;sum;j++)
        sum/=10;

    printf("sum of array = %d\n",sum2);
    for(i=j-1;i>=0;i--){
        a[i]=sum2%10;
        sum2/=10;
    }

    for(i=0;i<j;i++)
        printf("%d ",a[i]);
}
int main() {
    int a[100],i,size;
    printf("Enter the size of array = ");
    scanf("%d",&size);
    printf("Enter the array elements");
    for(i=0;i<size;i++)
        scanf("%d",&a[i]);
    system("cls");
    large_integer(a,size);
return 0;    
}
