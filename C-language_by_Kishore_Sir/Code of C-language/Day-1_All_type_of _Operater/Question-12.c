// wap in c to calculate the total  electricity bill including GST as per the given requirement .
// if the cost is greater than 100 gst will be 10%
// if the cost is greater than 500 gst will be 20%
// while calculating the gst in the bill print the total bill along with the owner name.

#include <stdio.h>
int main(int argc, char const *argv[])
{
    float bill_amount;
    printf("Emter the Cost of Electic bill = ");
    scanf("%f",&bill_amount);

    ((bill_amount < 100 || bill_amount <200) && printf("%.2f",bill_amount *0.1 + bill_amount) || printf("%.2f",bill_amount *0.2 + bill_amount));
    
    return 0;
}
