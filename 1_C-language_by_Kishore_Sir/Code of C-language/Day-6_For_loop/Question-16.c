// If a number when reversed, the square of the number and the square of the reversed number should be number which are reverse to each other, is Adam number.

// Example: 

// Input: 12

// 12 ^ 2 = 144

// 21 ^ 2 = 441

// The reverse of 144 is equal to 441 and reverse of 441 is equal to 144 so., 12 is an Adam number.

// 11, 12, 13, 21, 22, 31, 101, 102, 103, 111, 112, 113, 121 ... are Adam numbers.

#include<stdio.h>
int main() {
    int num,sq1,sq2,sum = 0,result,i,j,n1,n2;
    printf("Enter the number\n");
    scanf("%d",&num);
    n2=num;
    sq1 = num * num;
    printf("%d square is  %d\n",num,sq1);

    while(num){
        result = num % 10;
        sum=sum*10+result;
        num/=10;
    }
    n1=sum;
    sq2 = sum * sum;
    printf("%d square is  %d\n",sum,sq2);
    for(i=0;sq2!=0;i++){
        result = sq2 % 10;
        sum+=result;
        sq2/=10;
    }
    for(j=0 ; sq1!=0; j++){
        result = sq1 % 10;
        sum+=result;
        sq1/=10;

    }
    if(sq1 == sq2 && j == i ){
        printf("%d and %d is Adam numbers ",n2,n1);
    }else 
        printf("not Adam numbers");
return 0;    
}