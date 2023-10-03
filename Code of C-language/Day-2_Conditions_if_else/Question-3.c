#include<stdio.h>
void main(){
    int var1,var2,var3,var4;
    float result1,  result2, result3, Total;
    var3:
    printf("Menu as:\n1) Tea         --------------------- Rs. 10\n2) Coffee      --------------------- Rs. 20\n3) Cold coffee --------------------- Rs. 50\n");
    scanf("%d",&var1);
    
    if(var1==1)
    {
        printf("Ente the quantity of Tea = ");
        scanf("%d",&var2); 
        result1 = var2*10;
        printf("DO you want more any thing 'y' ");
        scanf("%c",&var2);
        if(var2 == 'y')
        {
            goto var3;
        }
    }
    if(var1==2)
    {
        printf("Ente the quantity of coffee = ");
        scanf("%d",&var2); 
        result2 = var2*20;
  
    }
    if(var1==3)
    {
        printf("Ente the quantity of cold cofee = ");
        scanf("%d",&var2);
        result3 = var2*30;
    }

    Total = result1 +result2 + result3;
    if (Total){
        printf("Total ammount is = %.2f\n" ,Total);
    }
    
}