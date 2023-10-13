// Create a C program that reads two integers from the user and prints "Equal" if they are equal, and "Not Equal" otherwise.



// Input as :

// Enter a number : 10 10



// Output as :

// Equal

#include <stdio.h>

int main() {

//Write your logic here...
int num1, num2;
printf("Enter the numbre \n");
scanf("%d %d",&num1, &num2);
if(num1 == num2){
    printf("Both are Equal");
}
if(num1 != num2){
    printf("Not Equal");
}

return 0;
}