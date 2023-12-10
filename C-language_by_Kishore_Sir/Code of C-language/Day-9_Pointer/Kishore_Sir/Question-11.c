#include<stdio.h>
void main(){
    int a[5]={12,36,45,65,85},*p,i;
    p=a;
    // p=&a[0];
    //p=&a;   //warning: assignment from incompatible pointer type [-Wincompatible-pointer-types]
    printf("Array Elements\n");
    for(i=0;i<5;i++){
        printf("%10d = %2d",(p+i),*(p+i));
    }
    printf("\n%d",*(p));
}