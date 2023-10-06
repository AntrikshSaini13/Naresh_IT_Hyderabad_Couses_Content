// Que-1)
// _______________________________________ 
// Write a program to read 5 subject marks from user and check whether student is pass, fail or not_pass & not_fail(ATKT-   Allowed).

//     NOTE : marks should be greater than 0 and less than 100 otherwise print "INVALID MARKS".
// 	pass: if student gets more than or equals 35 marks
// 	fail: if student gets less than 35 marks
// 	No_pass & No_fails(ATKT-Allowed to keep terms): if student is failed in 1 or 2 subjects

//     1) If student having more than 35 marks in all subject then print "STUDENT IS PASS".
//     2) If student having more than 35 marks in any 1 OR 2 subject then print STUDENT IS NOT_PASS and NOT_FAIL(ATKT)".
//     3) else print "STUDENT IS FAIL".

#include<stdio.h>
void main()
{
    char name[20];
    float hindi, english, math, sci, telgu,avg,total;
    printf("Enter the five subject marks\n\n");
    scanf ("%f %f %f %f %f",&hindi,&english,&math,&sci,&telgu);
    // printf("%.2f\t%.2f\t%.2f\t%.2f\t%.2f",hindi,english,math,sci,telgu,avg);
    if ((hindi >= 35 && hindi <= 100) && (math >= 35 && math <= 100) && (english >= 35 && english <= 100) && (sci >= 35 && sci <= 100) &&( telgu >= 35 && telgu <= 100))
    {
        printf("Enter your Namr\n");
        scanf("%s",name);
        total = hindi + english + math + sci + telgu;
        // printf("marks %f",total);
        avg = total/5;
        // printf("avg == %f\n",avg);
        if (avg > 75){
            printf("Distinctions\n");
        }
        else if (avg >= 60 && avg <= 75){
            printf("First division\n");
        }
        else if (avg >= 50 && avg < 60){
            printf("Second division\n");
        }
        else if (avg >=40 && avg < 50)
        {
            printf("Third division\n");
        }
        else if (avg >=35 && avg <40)
        {
            printf("Just Pass\n");
        }
        else{
            printf("yOu are Fail\n");
        }  
        printf("StuName\tHindi\tEnglish\tMath\tScience\tTelgu\tPercent\n");
        printf("-----------------------------------------------------------------\n");
        printf("%s\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\n",name,hindi,english,math,sci,telgu,total,avg);
    }
    else{
        printf("You are Fail Better \"Luck Next Time\"");
    }
}