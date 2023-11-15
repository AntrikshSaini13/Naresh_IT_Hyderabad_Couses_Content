//Creating dynamic one-dimensional array: with help of malloc()
// for float
#include<stdio.h>
#include<stdlib.h>
void main(){
    int n, i;float *p;
    printf("Enter array size = ");scanf("%d",&n);
    p=(float*)calloc(n,sizeof(int));
    printf("Enter %d integer number = ",n);
    for(i=0;i<n;i++) scanf("%f",(p+i));
    puts("Array Elements ");
    for(i=0;i<n;i++)printf("%10.2f",*(p+i));
    free(p);
    p=NULL;
}