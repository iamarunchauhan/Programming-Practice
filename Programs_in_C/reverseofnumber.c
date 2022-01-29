#include<stdio.h>

int main()
{
    int num,rem;
    int revnum = 0;
    
    printf("Enter number : ");
    scanf("%d",&num);
    
    while(num !=0)
    {
        rem = num % 10;
        revnum = revnum*10 + rem;
        num /= 10;
    }
    
    printf("Reverse of a number is - %d", revnum);

    return 0;
}