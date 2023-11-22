#include<stdio.h>
#include<stdlib.h>

void merage(int *array1,int *array2,int i,int j);// Mearge function declerations

void sorting(int *array3,int m);//Sorting function declerations 

void median(int *array3,int m);//Median function declerations

void median(int *array3,int m){//Median function declerations
    int i;
    float sum=0;
    for(i=0;i<m;i++)
        sum += array3[i];
    
    printf("\nSum of array %.2f\n",sum);   
    
    printf("median of array %.1f",sum/i);
}

void sorting(int *array3,int m){ //Sorting function definations
    int i,j,temp;
    puts("Before Sorted Array 3");            
    for(i=0;i<m;i++)
        printf("%d\n",array3[i]);
    for(i=0;i<m;i++)
        for(j=0;j<m;j++)
            if(array3[i]<array3[j]){
                temp=array3[i];
                array3[i]=array3[j];
                array3[j]=temp;
            }
    puts("Sorted Array 3");            
    for(i=0;i<m;i++)
        printf("%d\n",array3[i]);
        
    median(array3,m);
    
}

void merage(int *array1,int *array2,int i,int j){ //mearge function defenation
    int k,l,m,array3[100];//index_array_3;
    //index_array_3 = i+j;
    //printf("length of array third = %d\n",index_array_3);
    puts("Array-1");
    for(k=0;k<i;k++){
        printf("%d\n",array1[k]);
    }
    puts("Array-2");
    for(l=0;l<j;l++){
        printf("%d\n",array2[l]);
    }
    
    // merage of array here
    for(k=0,m=0;k<i;m++,k++) array3[m]=array1[k];
    for(l=0;l<j;l++,m++) array3[m]=array2[l];
    
    puts("Mearge of array1 and array2 in third array3");
    for(l=0;l<m;l++){
        printf("%d\n",array3[l]);
    }
    sorting(array3,m);
}
int main() { //function caller
    int array1[100],array2[100],i,j,k,l;
    puts("Enter size of 1st array");
    scanf("%d",&i);
    puts("Enter the array elements of array");
    for(k=0;k<i;k++)
        scanf("%d",&array1[k]);
        //printf("%d\n",array1[k]);
    puts("Enter size of 2nt array");
    scanf("%d",&j);
    puts("Enter the array elements of array");
    for(l=0;l<j;l++)
        scanf("%d",&array2[l]);
        //printf("%d\n",array2[l]);
    system("cls");
    merage(array1,array2,i,j); //function callie
    return 0;    
}