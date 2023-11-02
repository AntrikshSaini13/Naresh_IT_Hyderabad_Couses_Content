//Reading and printing array elements

#include<stdio.h>
#include<conio.h>
void main(){
    int a[100],n,i;
    printf("Enter the array size between 1-100 ");
    scanf("%d",&n);
    if(n<1||n>100)
        puts("Array size 1-100 only");
    else{
        printf("Enter the %d elements\n",n);
        for(i = 0; i < n; i++) scanf("%d",&a[i]);
        printf("Elements = ");
        for(i = 0; i < n; i++) printf("%4d",a[i]);
    }
} 