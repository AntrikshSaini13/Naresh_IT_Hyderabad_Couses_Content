/*Write a C program to find all the Armstrong number in beetween 100 to 10000 by using 2 different 

user defined function and one main function to display all the Armstrong number in the given range.

Armstrong number Example : 

153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153



Armstrong numbers between 100 and 10000 are:

153

370

371

407

1634

8208

9474
*/

// method - 1
/*
#include <stdio.h>
void isarmstrong(int num1,int num2){
    int i,j,k,count,num,sum,digit,d;
       for(i=num1;i<=num2;i++){
            count=0;
            num=i;
            while(num){
                num/=10;
                count++;
            }
            //printf("power = %d \n",count);
            for(j=i,sum=0;j!=0;j/=10){
                digit=j%10;
                //printf("%d\t ",digit);
                for(k=0,d=1;k<count;k++)d*=digit;
                    //printf("sq = %d  ",d);

                sum+=d;
            }
            //printf("sum = %d\t",sum);
            //printf("%d\n",i);
            if(sum==i) printf("%d\n",i);
       }
}
void main(){
    int num1, num2, num3;
    printf("Enter a number between 100 and 10000 : ");
    scanf("%d %d",&num1,&num2);
    isarmstrong(num1,num2);
}

*/
//method - 2

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

// 153

// 370

// 371

// 407

// 1634

// 8208

// 9474
