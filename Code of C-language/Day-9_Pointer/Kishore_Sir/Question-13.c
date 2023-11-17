//  its give diffent address becoz of we  use dynamic memory int is assigned run tin=me
//  use malloc() here
#include<stdio.h>
#include<stdlib.h>
// #include<alloc.h>
int a;
void main(){
    int *p , *q;
    p = (int*)malloc(10);
    printf("p = %u\n",p);
    // free(p);
    q = (int*)malloc(10);
    printf("q = %u\n",q);
}
// p = 11870144
// q = 11870144