#include<stdio.h>
int sum(int *a,int *b);//declerations of function
int sum(int *a,int *b){//function definations
    *a += *b;
}
int main(){ //main function it means caller
    int a,b;
    printf("Enter the number\n");
    scanf("%d %d",&a,&b);

    printf("before the function call %d\n",a+b);

    sum(&a,&b);  // callie
    printf("after the function call %d\n",a);
    return 0;
}

