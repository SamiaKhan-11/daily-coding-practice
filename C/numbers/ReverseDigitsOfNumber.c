//ReverseDigitsOfNumber.c
#include<stdio.h>
int main(){
    int num,reverse=0,d,temp;
    printf("Enter a number : ");
    scanf("%d",&num);
    temp=num;
    while(num>0){
        d=num%10;
        num=num/10;
        reverse=reverse*10+d;
    }
    printf("Reverse of the number %d is %d",temp,reverse);
    return 0;
}