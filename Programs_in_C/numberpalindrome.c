#include<stdio.h>

void main()
{
    int num;
    int flag = 1;
    
    printf("Enter a number - ");
    scanf("%d",&num);

    int arr[num];
    
    for(int i=0;i<num;i++)
    {
        scanf("%d",&arr[i]);   
    }
    
    for(int i=0;i<num;i++)
    {
        if(arr[i]!=arr[num-i-1])
        {
            flag = 0;
            break;
        }
    }
    
    if(flag)
    {
        for(int i=0;i<num;i++)
        {
            printf("%d",arr[i]);
        }       
        
        printf(" a palindrome");
    }
    else
    {
        for(int i=0;i<num;i++)
        {
            printf("%d",arr[i]);
        }
        
        printf(" is not a palindrome");
    }
}