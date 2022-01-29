#include<stdio.h>

void main()
{
    int m,n;
    printf("Enter number of rows and columns : ");
    scanf("%d %d",&m,&n);
    
    int arr[m][n];
    int sum = 0;
    
    printf("Enter values - \n");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    
    /*printf("Matrix elements : \n");
    
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("%d ",arr[i][j]);
        }
        
        printf("\n");
    }*/
    
    printf("Transpose of a Matrix : \n");
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            printf("%d ",arr[j][i]);
        }
        
        printf("\n");
    }
}