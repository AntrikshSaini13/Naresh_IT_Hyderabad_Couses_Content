/*
Amicable Numbers:

Write a program to find and display all pairs of amicable numbers within a given range, by using different user defined functions.

Amicable numbers are pairs of numbers where the sum of the proper divisors of one number is equal to the other number.

Example : 

-> a = 220

  The divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, and 110 excluding itself.

  The sum of these divisors is 284: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284.

-> b = 284

  The divisors of 284 are 1, 2, 4, 71, and 142 excluding itself.

  The sum of these divisors is 220: 1 + 2 + 4 + 71 + 142 = 220.

So, (220, 284) is a pair of amicable numbers.

Amicable pairs between 100 and 10000 are:

(220, 284)

(284, 220)

(1184, 1210)

(1210, 1184)

(2620, 2924)

(2924, 2620)

(5020, 5564)

(5564, 5020)

(6232, 6368)

(6368, 6232)

*/
/*
#include <stdio.h>
#include<stdlib.h>
//function declerations
int sumOfDivisors(int num);
int areAmicable(int num1, int num2);

//function definations/body
int sumOfDivisors(int num) {
    int i, num1, num2, sum;

    //puts("divisor number -1");
    for(i=1,sum=0;i<num;i++)
        if(num%i==0){
            //printf("%-4d",i);
            sum+=i;
        }
    //printf("\n");
    num1 = sum;
    //printf("Sum-1 = %d\n",sum);
    
    //puts("divisor number -2");
    for(i=1,sum=0;i<num1;i++)
        if(num1%i==0){
            //printf("%-4d",i);
            sum+=i;
        }
    //printf("\n");
    num2 = sum;
    //printf("Sum-2 = %d\n",sum);
    
    if(areAmicable(num,num2)) printf("%d   ->   %d\n\n",num2,num1);
}


int areAmicable(int num1, int num2) {
    if(num1 == num2)return 1;
    return 0;
}

int main() {
    
    //write your code here...
    int start_of_num,end_of_num,i;
    puts("Enter the Starting of number and Ending of number");
    scanf("%d %d",&start_of_num,&end_of_num);
    system("cls");
    for(i=start_of_num;i<=end_of_num;i++){
        sumOfDivisors(i);
    }
    return 0;
}
*/