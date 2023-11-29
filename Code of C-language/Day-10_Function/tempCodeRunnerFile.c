#include <stdio.h>
#include <math.h>

int isArmstrong(int num);//function declaration

int isArmstrong(int num){//function definations/body
    //counting the number
    int power=0,count=0,i,sum=0,digit=0;

    for(count=num;count!=0;count/=10) 
    power++;

    for(i=num,sum=0;i!=0;i/=10){
        digit=i%10;
        sum+=pow(digit,power);
    }
    return sum;
}
void main(){
    int starting_number,ending_number,i;
    puts("Enter the Starting and Ending number in between for Armstrome: ");
    scanf("%d %d",&starting_number,&ending_number);
    for(i=starting_number;i<=ending_number;i++){
        if(i==isArmstrong(i)){
            printf("%d\n",i);
        }
    }
}
