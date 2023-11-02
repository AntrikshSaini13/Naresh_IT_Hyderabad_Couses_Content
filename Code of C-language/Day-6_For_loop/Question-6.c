// Write a program in C to display the n terms of a harmonic series and their sum.

// 1 -1/2 +1/3 - 1/4 + 1/5 -1/6... 1/n terms

// Test Data :

// Enter the value of n: 5

// Harmonic Series: 1 - 1/2 + 1/3 - 1/4 + 1/5

// Expected Output :

// Sum of the series: 0.783333


















































// #include <stdio.h>

// int main() {
//     int n, i;
//     float sum = 0.0;

//     printf("Enter the value of n: ");
//     scanf("%d", &n);

//     printf("Harmonic Series: ");
//     for (i = 1; i <= n; i++) {
//         if (i % 2 == 1) {
//             printf("1/%d", i);
//             if (i != n) {
//                 printf(" - ");
//             }
//             sum += 1.0 / i;
//         } else {
//             printf("-1/%d", i);
//             if (i != n) {
//                 printf(" + ");
//             }
//             sum -= 1.0 / i;
//         }
//     }

//     printf("\nSum of the series: %f\n", sum);

//     return 0;
// }