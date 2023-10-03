// Write a c program to round of the number to it's next and 

// previous multiplication of 10 ?



// Input as :- 66

// Output as :- Next multiplication is :-70

// Previous multiplication is :-60
# include <stdio.h>
void main(){
    int var1,var2;
    printf("Enter the value = ");
    scanf("%d",&var1);
    var2 = var1 / 10;
    var1 = var2 * 10;
    var2 = ++var2 * 10;
    
    printf("Next Vaue is = %d\nPrevius Value is = %d",var2,var1);
    
}