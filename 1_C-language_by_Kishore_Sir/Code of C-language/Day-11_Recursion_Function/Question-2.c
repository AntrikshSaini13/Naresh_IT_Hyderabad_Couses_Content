/*
 Write a program in C to calculate the power of any number using recursion. 

Test Data :

Input the base value : 2

Input the value of power : 6

Expected Output :

The value of 2 to the power of 6 is : 64  
*/
#include <stdio.h>
int mul=1;
int powerOfNum(int num, int str_range, int end_range);
int powerOfNum(int num, int str_range, int end_range){
    mul*=num;
    if(str_range!=end_range) powerOfNum(num, ++str_range, end_range);
    return mul;
}

int main()
{
    int num, start=1, end;
    puts("Enter the base value");
    scanf("%d",&num);
    puts("Enter the value power");
    scanf("%d",&end);
    printf("Power of %d\n",powerOfNum(num, start, end));
    return 0;
}