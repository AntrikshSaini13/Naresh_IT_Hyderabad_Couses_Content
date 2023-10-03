// 2)wap in c to calculate the tax of employee based on the position
// indicate manager as M or m 
// indicate clerk as C or c
// indicate developer as D or d
// if the employee is manager the tax will be 20% of its salary 
// if the employee is clerk the tax will be 10% of its salary
// if the employee is developer the tax will be 5% of its salary
#include<stdio.h>
void main()
{
    float M_Salary, C_Salary, D_Salary;
    printf("Enter the Salary of Manger, Clerk, Developer = ");
    scanf("%f %f %f",&M_Salary,&C_Salary,&D_Salary);
    printf("Manager salary after tax is = %.2f\n",M_Salary-M_Salary*20/100);
    printf("Clark salary after tax is = %.2f\n",C_Salary-C_Salary*10/100);
    printf("Developer salary after tax is = %.2f\n",D_Salary-D_Salary*5/100);
}