// Write a C program to round of a number to it's next multiplication of 10?
// For example :-
// Input as:- 35
// Output as: 40

// Input as :- 62
// Output as:- 70
#include <stdio.h>
void main()
{
    int a = 66, var;
    var = a / 10;
    var = ++var * 10;
    printf("%d",var);
}