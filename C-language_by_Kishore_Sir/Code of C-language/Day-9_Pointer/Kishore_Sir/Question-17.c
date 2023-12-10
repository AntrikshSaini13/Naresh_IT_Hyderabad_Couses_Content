//Creating dynamic one-dimensional array: with help of calloc()
// for char
#include<stdio.h>
#include<stdlib.h>
void main(){
    int n, i;char *p;
    printf("Enter array size = ");scanf("%d",&n);
    p=(char*)calloc(n,sizeof(char));
    printf("Enter %d char = ",n);
    for(i=0;i<n;i++) scanf("%c",(p+i));
    puts("Array Elements ");
    for(i=0;i<n;i++)printf("%2c",*(p+i));
    free(p);
    p=NULL;
}