// Write a c program to find the volume and surface area of cylinder?
// Take the radius and height from the user and then apply the formula.

// Formula :-
// Surface_area = 2 * Pi * r * (r + h)
// Volume = Pi * r * r * h
#include<stdio.h>
#define pi 3.14 /*macro*/
void main()
{
    float r,h;
    // const float Pi = 3.14;
    printf("Enter the value of Radius and height of cylinder = ");
    scanf("%d %d",&r,&h);
    printf("Surface Area is = %d \nVolume is = %d",2 * pi * r * (r+h),pi * r * r * h);
}