// Write a C program to count the number of alphabet present in a given String .

// Input as : Apple

// Output as : The count of alphabet is : 5


#include<stdio.h>
int main() {
    char s[10]={"Apple"};int i,w;
    for(w=0,i=0;s[i]!='\0';i++){
        if(s[i]>='a'&&s[i]<='z')w++;
        if(s[i]>='A'&&s[i]<='Z')w++;
    }
    printf("%d",w);
return 0;    
}