#include<stdio.h>
void main(){
    int array[5],i,j;
    for(i=0,j=0;i<10;i++,j++){
        array[i]=i;
        printf("%8d",array[i]);
    }
    // printf("\n%d",array[5]);
    
}