//Creating dynamic one-dimensional array: with help of calloc()

#include<stdio.h>
#include<stdlib.h>
void main(){
    int n, i, *p;
    printf("Enter array size = ");scanf("%d",&n);
    p=(int*)calloc(n,sizeof(int));
    printf("Enter %d integer number = ",n);
    for(i=0;i<n;i++) scanf("%d",(p+i));
    puts("Array Elements ");
    for(i=0;i<n;i++)printf("%4d",*(p+i));
    free(p);
    p=NULL;
}