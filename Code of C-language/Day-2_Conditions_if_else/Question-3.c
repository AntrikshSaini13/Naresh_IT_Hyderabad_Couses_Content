// Que-3)
// -----------------
// Write a c program for the tea stall counter by giving the menu as the 
// option and their price 

// Menu as:
// 1) Tea         --------------------- Rs. 10
// 2) Coffee      --------------------- Rs. 20
// 3) Cold coffee --------------------- Rs. 50
// and so on you can provide the input by your own choice

// Now based on the user choice you have to print the bill with the
// price of the product.

// Also write a logic if customer want to add some more option after 
// bill printing

// Also wirte a logic for cancelling the order and giving the paid
// money back to the user.

#include<stdio.h>
void main(){
    int var1;
    char var2;
    float result1,result2, result3, Total;
    start:
    printf("Menu as:\n1) Tea         --------------------- Rs. 10\n2) Coffee      --------------------- Rs. 20\n3) Cold coffee --------------------- Rs. 50\n");
    scanf("%d",&var1);
    
    if(var1==1)
    {
        printf("Ente the quantity of Tea = ");
        scanf("%d",&var2); 
        result1 = result1 + var2*10;
        printf("DO you want more any thing 'y'otherwise 'n'\n  ");
        scanf(" %c",&var2);
        if(var2 == 'y' || var2 == 'Y')
        {
            goto start;
        }
    }
    if(var1==2)
    {
        printf("Ente the quantity of coffee = ");
        scanf("%d",&var2); 
        result2 =result2 + var2*20;
        printf("DO you want more any thing 'y' otherwise 'n'\n ");
        scanf(" %c",&var2);
        if(var2 == 'y')
        {
            goto start;
        }
    }
    if(var1==3)
    {
        printf("Ente the quantity of cold cofee = ");
        scanf("%d",&var2);
        result3 = result3 + var2*50;
        printf("DO you want more any thing Enter 'y' otherwise 'n' \n");
        scanf(" %c",&var2);
        if(var2 == 'y')
        {
            goto start;
        }










        
    }
    Total = result1 +result2 + result3;;
    if ((int)Total != 0){
        printf("Total ammount is = %.2f\n" ,Total);
    }
    if (var1 > 3){
        printf("Enter the valid Input Again\n");
        printf("DO you want more any thing Enter 'y' otherwise 'n' \n");
        scanf(" %c",&var2);
        if(var2 == 'y')
        {
            goto start;
        }

    }
    printf("Thank you for Coming ");  
}