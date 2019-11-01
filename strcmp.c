#include<stdio.h>
#include<string.h>

void main()
{
    char s1[100],s2[100];
    
    printf("Enter strings - ");
    scanf("%s %s", &s1, &s2);
    
    int f = strcmp(s1,s2);
    
    printf("Result after comparing string : %d",f);
}