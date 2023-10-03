// /*  Write a program to accept three numbers from user and print them in 
// ascending and descending order in C language?

// Input 1 as: a=9 b=4 c=6
// Output as:
// In Asc order - b c a   i.e (4 6 9)
// In Dec order - a c b   i.e (9 6 4)

// Input 2 as: 9 6 4
// Output as:
// In Asc order - c b a  i.e(4 6 9)
// In Dec order - a b c  i.e(9 6 4)  */

#include<stdio.h>
#include<conio.h>
int main()
{
	int a,b,c;
	
	printf("Enter the value=");
	scanf("%d %d %d", &a , &b,&c);
	
	(a>b && a>c)&&(b>c)&&printf("asce order= %d %d %d",c,b,a)&& printf(" desc order= %d %d %d",a,b,c);
	(a>b && a>c)&&(b<c)&&printf("asce order= %d %d %d",b,c,a)&& printf(" desc order= %d %d %d",a,c,b);
	
	(b>a && b>c)&&(a>c)&&printf("asce order= %d %d %d",c,a,b)&& printf(" desc order= %d %d %d",b,a,c);
	(b>a && b>c)&&(a<c)&&printf("asce order= %d %d %d",a,c,b)&& printf(" desc order= %d %d %d",b,c,a);
	
	(c>a && c>b)&&(a>b)&&printf("asce order= %d %d %d",b,a,c)&&printf(" desc order= %d %d %d",c,a,b);
	(c>a && c>b)&&(a<b)&&printf("asce order= %d %d %d",a,b,c)&&printf(" desc order= %d %d %d",c,b,a);
	
	getch();
}