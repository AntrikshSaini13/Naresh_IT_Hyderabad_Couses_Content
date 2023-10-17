
#include<stdio.h>
#include<conio.h>
int main()
{
int nc,nr,r,c,a;
	printf("Enter of value columns & Rows\n");
                scanf("%d %d",&nc,&nr);
            for(r=1;r<=nr;r++);
            {
            a=r;
		for(c=1;c<=nc;c++)
		{  
		printf("%d",a++);	 		
		}
		printf("\n");
		}    
		
		getch(); 
}
//faltu code 