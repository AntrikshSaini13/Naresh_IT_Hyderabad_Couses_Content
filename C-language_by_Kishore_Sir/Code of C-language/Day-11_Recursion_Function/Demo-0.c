#include <stdio.h>
int i=1;
int fun1();
int fun1(){
    // printf("Hello, world -> %d\n",i);
    i++;
    if(i<=10){
        fun1();
    }
    printf("Hello, world -> %d\n",i);
    return   0;
}
void main(){
    fun1();
   // printf("Hello, world!");
}

// #include <stdio.h>
// int i = 1;
// void main() // caller
// {   
//     printf("Hello, world!\n");
//     i++;
//     if(i<=10) main();//callie
// }