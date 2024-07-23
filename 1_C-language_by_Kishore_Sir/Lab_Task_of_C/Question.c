
# include <stdio.h>
int main()
{
int a=0,b=1,c=2;
printf("%d %d %d\n",a++,++a,b++);
printf("%d %d %d",c++,++c,++b);
return 0;
}