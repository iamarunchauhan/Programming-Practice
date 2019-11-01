#include<stdio.h>
#include<string.h>

int main()
{
    int ln;
    char s[100];
    
    printf("Enter string : ");
    //scanf("%[^\n]%*c", s);
    scanf("%s",s);
    //gets(s);
    
    ln = strlen(s);
    
    for(int i=ln-1;i>=0;i--)
    {
        //printf("Output");
        printf("%c",s[i]);
    }
    
    return 0;
}