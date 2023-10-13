#include<stdio.h>
int main()
{
      int phy, che, bio, mat, com, sum, avg;
      char ch;
      printf("Enter the Marks of Five Subject\n");
      scanf("%d %d %d %d %d",&phy, &che, &bio, &mat, &com);
      sum = phy + che + bio + mat + com;
      //  printf("sum %d\n",sum);
      avg = sum /5;
      //  printf("avg %d\n",avg);
      if(phy>33 && phy <= 100 && che > 33&& che <= 100 && bio > 33 && che <= 100 && com > 33&&com <= 100)
      {
            if (avg>=80 && avg <= 90) ch = 'a';
            else if (avg>=70 && avg <= 80) ch = 'b';
            else if (avg>=60 && avg <= 70) ch = 'c';
            else if (avg>=50 && avg <= 60) ch = 'd';
            else if (avg>=40 && avg <= 50) ch = 'e';
      }
      else puts("Fail");
      
      switch(ch)
      {
         case 'a':
            printf("Grade A prcentage is %d%c",avg,37);
            break;
         case 'b':
            printf("Grade B prcentage is %d%c",avg,37);
            break;
         case 'c':
            printf("Grade C prcentage is %d%c",avg,37);
            break;
         case 'd':
            printf("Grade D prcentage is %d%c",avg,37);
            break;
         case 'e':
            printf("Grade E prcentage is %d%c",avg,37);
            break;
        // default : puts("Fail");
     }
    return 0;
}