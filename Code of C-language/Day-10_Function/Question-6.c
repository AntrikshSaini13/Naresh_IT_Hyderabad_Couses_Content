#include <stdio.h>
#include <math.h>
int isArmstrong(int num);

void power(int base, int exponent);

void power(int base, int exponent) {
   int k,i,j,count,sum,num,power,d,p;

   printf("%d %d\n",base, exponent);

   for(i=base;i<=exponent;i++){
        //power count
        num=i;
        power=0;
        while(num){
            num/=10;
            power++;
        }
        //printf("%d\n",power);
        for(j=i;j!=0;){
            d=j%10;
            j/=10;            sum+=p;
            }
        }
        if(sum==i) 
            printf("%d\n",i);
        //printf("%d\n",i);
    //return 0;
    }
}
int main() {
        //write your code here...r");
    scanf("%d",&num1);
    puts("Enter the Ending of armsrong number");    scanf("%d",&num2);
    power(num1,num2);
    return 0;
}