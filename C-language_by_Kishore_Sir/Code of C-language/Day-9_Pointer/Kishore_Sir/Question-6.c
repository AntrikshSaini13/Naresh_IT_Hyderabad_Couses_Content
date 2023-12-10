// Finding Pointer size.

#include<stdio.h>
void main(){
    char *r;
    float *q;
    int *p;
    printf("%d %d %d",sizeof(p),sizeof(q),sizeof(r));
    printf("\n\n");
    printf("%d %d %d",sizeof(*p),sizeof(*q),sizeof(*r));
}