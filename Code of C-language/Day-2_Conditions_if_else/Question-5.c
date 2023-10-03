// Write a c program for the alarm clock by following the requirement 



// Req:- 

// =======================

// There are 7 days in a week as 

// Sunday ---------------------------------   represented as  1

// Monday---------------------------------   represented as  2

// Tuesday--------------------------------   represented as  3

// Wednesday --------------------------   represented as  4

// Thursday------------------------------   represented as  5

// Friday ---------------------------------   represented as  6

// Saturday-----------------------------    represented as  7



// Saturday and sunday is known as weekend 

// Monday to Friday is known as weekdays 



// suppose you need to take leave from the office so 

// the representing holiday varaible name will be OnVaccation



// OnVaccation is true represented by t or T indicate you had taken 

// the leave 

// OnVaccation is false represented by f or F indicate you had not

// taken the leave 



// * If the day are between monday to fri and OnVaccation is 

//  false that means your alarm will ring at "7:00 clock". 



// * If the day are between monday to fri and OnVaccation is 

//  true that means your alarm will ring at "9:00 clock". 



// * If the day are Sat or Sunday and OnVaccation is 

//  false that means your alarm will ring at "8:00 clock".



// * If the day are Sat or Sunday and OnVaccation is 

//  true that means your alarm will be "off".



// [note :- You can use ladder if or if and else if]

#include<stdio.h>
int main(){
    char OnVaccation ;
    
    printf("I want live the vaccation for yes[Y/y] and no[n/N] and sun as weel as sat[s/S] \n");
    scanf("%c",&OnVaccation);
    
    // this for working time mon - fri
    if(OnVaccation == 'y' || OnVaccation == 'y' )
    {
        printf("Your alarm will ring at 7:00 clock");
    }
    //this for vaccation
    else if(OnVaccation == 'n' || OnVaccation == 'N')
    {
        printf(" your alarm will ring at 9:00 clock");
    }
    //thid for sat and sun
    else if (OnVaccation == 's'|| OnVaccation == 'S')
    {
        printf("your alarm will ring at 8:00 clock");
    }
    else
    {
        printf("Enter valid options");
    }
     return 0;
}