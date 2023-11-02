

// 1 2 3 4 5   output 
// 2 3 4 5 6
// 3 4 5 6 7 
// 4 5 6 7 8
// 5 6 7 8 9*/
#include<stdio.h>
#include<conio.h>
int main()
{
int nc,nr,i,j,a;
printf("Enter the number of row\n");
scanf("%d",&nr);
	for(i=1;i<=nr;i++){
        for(j=i;j<=4+i;j++){
            printf("%d\t",j);
        }
        printf("\n");
    }
}