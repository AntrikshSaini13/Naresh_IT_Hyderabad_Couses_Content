// Write a C Program to check whether the triangle is an equilateral, isosceles or scalene triangle. Using the if-else statement.
// Take the inputs from the user.
// Case-1 :
// Enter the lengths of the sides of the triangle:
// Side 1: 5
// Side 2: 5
// Side 3: 5
// Case-2:
// Enter the lengths of the sides of the triangle:
// Side 1: 4
// Side 2: 5
// Side 3: 4
// The triangle is an isosceles triangle.
// Case-3:
// Enter the lengths of the sides of the triangle:
// Side 1: 3
// Side 2: 4
// Side 3: 5
// The triangle is a scalene triangle.

#include <stdio.h>

int main() {
    int side1, side2, side3;
    printf("Enter the three side of the trianle \n");
    scanf("%d%d%d",&side1,&side2,&side3);
    if (side1 == side2 && side2 == side3 && side1 == side3)
    {
        printf("Equilateral triangle");
    }
    else if ((side1 == side2 ||side2 == side3) || side3 == side1) 
    {
        printf("isosceles triangle");
    }
    else if (side1 != side2  && side2 != side3 && side1 != side3) {
        printf("scalene triangle");
    }
    else {
        printf("Invalid");
    }

    return 0;
}