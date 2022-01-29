#include<stdio.h>

void main()
{
    int m,n;
    printf("Enter number of rows and columns : ");
    scanf("%d %d",&m,&n);
    
    int arr[m][n];
    
    printf("Enter values - \n");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    
    printf("The elements of first column are -\n");
    for(int i=0;i<m;i++)
    {
        int j=0;
        printf("%d\n",arr[i][j]);
    }
    
    printf("The elements of last column are -\n");
    for(int i=0;i<m;i++)
    {
        int j=n-1;
        printf("%d\n",arr[i][j]);
    }
}