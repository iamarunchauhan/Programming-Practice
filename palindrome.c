#include<stdio.h>
#include<string.h>

void main()
{
    char mystring[100];
    int flag = 1;
    
    printf("Enter string : ");
    scanf("%s",mystring);
    
    int ln = strlen(mystring);
    
    for(int i=0;i<ln-1;i++)
    {
        if(mystring[i]!=mystring[ln-i-1])
        {
            flag = 0;
            break;
        }
    }
    
    if(flag)
    {
        printf("%s is a palindrome",mystring);
    }
    else
    {
        printf("%s is not a palindrome",mystring);
    }
}