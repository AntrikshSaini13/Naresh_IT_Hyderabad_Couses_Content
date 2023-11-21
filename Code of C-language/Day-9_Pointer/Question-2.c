#include<stdio.h>
#include<conio.h>
void show(int b[3])// or a[ ] or *a
{
printf("Array elements %d %d %d\n",b[0],b[1],b[2]);
//a[0]=100; a[1]=200; a[2]=300;
}
void main()
{
int a[3]={10,20,30};
//clrscr();
show(a); //or show(&a);
printf("Array elements %d %d %d",a[0],a[1],a[2]);
getch();
}