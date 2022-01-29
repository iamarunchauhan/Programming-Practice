#include<stdio.h>

void main()
{
    int num,count =0;
    
    printf("Enter number : ");
    scanf("%d",&num);
    
    while(num !=0)
    {
        num = num/10;
        count = count + 1;
    }
    
    printf("The count of a number is - %d",count);
}