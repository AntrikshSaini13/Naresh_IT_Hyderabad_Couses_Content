//pointer compatibility

#include<stdio.h>
void main(){
    int n=10;
    float *p;
    p=&n;

    // float n=10; give error
    // int *p;
    // p=&n;
    
    printf("a = %d",n);
    printf("\n\n");
    printf("a = %d",*p);
    }

    #