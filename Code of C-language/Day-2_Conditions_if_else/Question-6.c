// Write a c program to calculate the salary and based on that salary calculate the tax for the person

// based on their designation by following few rules which are below



// * 3 Type of Designation are there name as

//  -> Developer

//  (Indicated by D or d)

//  -> Trainer 

//  (Indicated by T or t)

//  -> Manager 

//  (Indicated by M or m)



// [Note - For wrong designation print a message as "Invalid input".



// * 3 Type of Extra Allowance are there which will be added in the salary 

//  Home Allowance  =10000

//  Food Allowance  =3000

//  Travel Allowance =10000





// * If the designation is Developer There salary will be calculated by adding 

//  Total Salary= Salary + Home Allowance



//  If the designation is Trainer There salary will be calculated by adding 

//  Total Salary= Salary + Home Allowance + Food Allowance 



//  If the designation is Trainer There salary will be calculated by adding 

//  Total Salary= Salary + Home Allowance + Food Allowance + Travel Allowance



// * If the Total Salary is greater than 40000 then calculate the tax as 10% from the total salary 

//  else 5% of total salary



// [note: Take the Designation and salary from the user and based on the that 

//     calculate Total Salary and also based on Total Salary calculate the tax].





#include<stdio.h>
int main(){
    char var;
    const unsigned int Home_Allowance  =10000, Food_Allowance  =3000, Travel_Allowance =10000;
    int Total_Salary,Salary;
    float tax, After_tax;
    
    
    printf("Enter here How you are ? [Manager(M/n)/] and [Trainer(t/T) and [Developer(d/D)]]\n");
    scanf("%c",&var);
    
    if(var == 'm' || var || 'M'){
        printf("Enter the Salary of manager is = ");
        scanf("%d",&Salary);
         Total_Salary = Salary + Home_Allowance + Food_Allowance + Travel_Allowance;
         printf("Total Salary is %d\n",Total_Salary);
         if (Total_Salary > 40000){
            tax = Total_Salary * 10 / 100.00;
            After_tax = Total_Salary - tax;
            printf("Tax on Salary %.2f \nAfter Tax the salary is %.2f\n",tax,After_tax);
            return 0;
         }
         else{
            tax = Total_Salary * 5 / 100.00;
            After_tax = Total_Salary - tax;
            printf("Tax on Salary %.2f \nAfter Tax the salary is %.2f\n",tax,After_tax);
            return 0;
         }
    }
    
    else if(var == 'd' || var || 'D'){
        printf("Enter the Salary of manager is = ");
        scanf("%d",&Salary);
        Total_Salary = Salary + Home_Allowance;
        printf("Total Salary is %d\n",Total_Salary);
        if (Total_Salary > 40000){
            tax = Total_Salary * 10 / 100.00;
            After_tax = Total_Salary - tax;
            printf("Tax on Salary %.2f \nAfter Tax the salary is %.2f\n",tax,After_tax);
            return 0;
         }
         else{
            tax = Total_Salary * 5 / 100.00;
            After_tax = Total_Salary - tax;
            printf("Tax on Salary %.2f \nAfter Tax the salary is %.2f\n",tax,After_tax);
            return 0;
         }
    }
    
    else if(var == 't' || var || 'T'){
        printf("Enter the Salary of manager is = ");
        scanf("%d",&Salary);
        Total_Salary = Salary + Home_Allowance + Food_Allowance;
        printf("Total Salary is %d\n",Total_Salary);
        if (Total_Salary > 40000){
            tax = Total_Salary * 10 / 100.00;
            After_tax = Total_Salary - tax;
            printf("Tax on Salary %.2f \nAfter Tax the salary is %.2f\n",tax,After_tax);
            return 0;
         }
         else{
            tax = Total_Salary * 5 / 100.00;
            After_tax = Total_Salary - tax;
            printf("Tax on Salary %.2f \nAfter Tax the salary is %.2f\n",tax,After_tax);
            return 0;
         }
    }
    

}