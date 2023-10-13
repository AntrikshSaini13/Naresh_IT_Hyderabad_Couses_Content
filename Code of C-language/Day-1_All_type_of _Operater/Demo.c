


#include<stdio.h>
int main(){
    int num,i=1,sum=0;
    printf("Enter the number = ");
    scanf("%d",&num);
    while(i<num){
        if(num%i == 0)
        sum = sum + i;
        i++;
    }
    if(num == sum) printf("perfect number");
    else printf("perfect number. not");
    return 0;
}