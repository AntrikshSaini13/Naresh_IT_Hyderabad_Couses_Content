#include<stdio.h>
#include<conio.h>
int main()
{
	int opt,prize=0,amt;
	char ch;
	menu:
	
	printf("MENU AS :\nopt 1. for tea=10\nopt2.for coffee=20\nopt 3.for cold coffee=30\n");
	printf("enter your option\n");
	scanf("%d",&opt);
	opt == 1 && printf("prize  for tea is %d\n",amt=prize+10);
	opt == 2 && printf("prize for coffee is %d\n",amt=prize+20);
	opt == 3 && printf("prize for cold coffee is %d\n",amt=prize+50);
	opt >= 1 && 3 <= opt && printf("choose valid option\n");
	printf("do you want to order again? Enter yes as y or Y\n");
	scanf(" %c",&ch);
	if(ch == 'Y' || ch == 'y'){
		goto menu;
	}
	printf("please pay the amount: %d:",amt);
	scanf("%d",&amt);
	amt>=prize && printf("total amount is %d",amt-prize);
	amt<prize && printf("total amount to pay more is %d",amt-prize);
	return 0;
}