// Write a C program for a service center by following given Rules and Guide lines.
// * This service center only accepts 2 wheeler ,3 wheeler & 4 wheeler . If any other vehicle 
// came to you , you have to show a message that "this service center is not accepting
// other than 2 wheeler, 3 wheeler and 4 wheeler".
// * If the vehicle is 2 ,3 & 4 only then you have to ask the user what is the age of the vehicle.
// * If the age your vehicle is above 8 months then only accept the service center 
// otherwise you have to show a message that "your vehicle servie will done after a while".
// * If the vehicle age is greater than 8 months then show options to the user on the console.
// * Options:
// 1)Enter 1 for tyre problem
// 2)Enter 2 for fuel problem
// 3)Enter 3 for engine issue
// 4)Enter 4 for general services
// * If the user enter 1 as input so it is tyre problem statement so you have to show a message "how many tyres you are facing the issue ?", based on the issue on the no of tyres,
// generate the bill.
// * For example tyre cost Rs. 400 , if the user providing 3 tyre then the bill should be
// generated as Rs. 1200 in below format.
// Name of the owener
// Name of the bike
// Issue
// Bill
// * For fuels problem cost is Rs.1500
// * For engine issue cost is Rs.5000
// * For general servicing cost is Rs.1000
// And generate the bill in the above format.

#include <stdio.h>
#include <string.h>

int main() {
    char name_owener[20], bike_name[20];
    int wheeler,mon,chooses,tyres;
    float total;
    start:
    printf("\n\nEnter the type of wheeler [2 wheeler / 3 wheeler / 4 wheeler]\n");
    scanf("%d",&wheeler);
    if(wheeler >= 2 && wheeler <= 4){
        printf("Enter your name\n");
        scanf(" %s",name_owener);
        printf("Enter your wheeler name\n");
        scanf(" %s",bike_name);
        
        printf("Enter the month of vahicle\n");
        scanf(" %d",&mon);
        
        if (mon > 8)
        {
            printf("\n* Options:\n\n1)Enter 1 for tyre problem\n2)Enter 2 for fuel problem\n3)Enter 3 for engine issue\n4)Enter 4 for general services\n");
            scanf(" %d",&chooses);
            
            if(chooses == 1){
                printf("\n\"How many tyres you are facing the issue ?\"\n");
                scanf(" %d",&tyres);
                total = 400 * tyres;
            }
            else if(chooses == 2){
                total = 1500;
                // issue[] = "fuel problem";
            }
            else if(chooses == 3){
                total = 5000;
                // issue[] = "engine issue";
            }
            else if(chooses == 4){
                total = 1000;
                // issue[] = "general services";
            }
            else{
                printf("Enter the valid option plz");
            }
        }
        if((int)total != 0){ 
            printf("\nOwener is %s\nBike is %s\nTotal charge of bkie repair  is %.2f\n",name_owener,bike_name,total);
        }
        else{
            printf("\"your vehicle servie will done after while\"\n");
        }
    }
    else{
        printf("Enter the Valid choose pls\n");
        goto start;
    }
    return 0;
}


