// Write a C program to store some integers in an array and print all the prime numbers available in that array

// Input as :

// 1 2 3 4 5

// Output as :

// 2 3 5

#include<stdio.h>
#include<string.h>
int main(){
    int array[100],i,num,j,c;
    printf("Enter the number between 1-100 = ");
    scanf("%d",&num);
    
    printf("Insert the Array element \n");
    for(i=0;i<num;i++)
        array[i]= i+1;
    
    for(i=0;i<num;i++){
        c=0;
        for(j=2;j<=array[i]-1;j++)
            if(array[i]%j==0)
                c++;
            
        if(c==0)
        printf("%d",array[i]);
    }
}