
/*Write a C program to rotate an array of integers to the right by a specified number of positions. For example, i
f you have an array [1, 2, 3, 4, 5] and you want to rotate it to the right by 2 positions, the result should be [4, 5, 1, 2, 3].
(Develop it by using pointers & function).
*/
#include<stdio.h>
void rotate_array(int *p,int size);
void rotate_array(int *p,int size){
    int i,positions;;
    printf("Enter the rotate position of array = ");
    scanf("%d",&positions);
    for(i=size-positions;i<size;i++)
        printf(" %d ",*(p+i));
    for(i=0;i<=positions;i++) 
        printf("%d ",*(p+i));
}
void main()
{
    int a[100]={},i,size;
    printf("Enter the size of array to rotate = ");
    scanf("%d",&size);
    printf("Enter the elements of array to rotate = ");
    for(i=0; i<size;i++)
        scanf("%d",&a[i]);
    rotate_array(a,size);
}
