// Write a C program to do a arithmetic operation on two numbers by using Switch Case. Take the operators(+,-,*,/,%) as cases and take the input from the user that what kind of operation user want to do on two number.

// Input as: 
// ------------
// Enter num1 :10

// Enter num2 :20

// Enter operation : *

// O/P as :

// ---------

// Multiplication is :200

#include<stdio.h>
#include<stdlib.h>
int main()
{
    int num;
    float num1,num2;
    printf("Select Options :\nAdditions\t1\nSubstraction\t2\nMutiplications\t3\nDivision\t4\nModules\t\t5\n");
    scanf("%d",&num);
    
    switch(num)
    {
    //   system("cls");
        case 1:
            printf("Sum\nEnter the two number\n");
            scanf("%f %f",&num1,&num2);
            
            printf("sum is %f",num1 + num2);
        case 2:
            printf("Subtraction\nEnter the two number\n");
            scanf("%f %f",&num1,&num2);
            
            printf("Subtractionis %f",num1 - num2);
        case 3:
            printf("Multiplication\nEnter the two number\n");
            scanf("%f %f",&num1,&num2);
            
            printf("multiplication is %f",num1 * num2);
        case 4:
            printf("Divission\nEnter the two number\n");
            scanf("%f %f",&num1,&num2);
            
            printf("Divission is %f",num1 / num2);
        case 5:
            printf("Modules\nEnter the two number\n");
            scanf("%f %f",&num1,&num2);
            
            printf("Modules is %d",(int)num1 % (int)num2);
    }
    return 0;
}