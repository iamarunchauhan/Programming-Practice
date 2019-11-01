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
    
    printf("Sum of elements in each row\n");
    
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            sum += arr[i][j];
        }
        
        printf("Sum of %d row is %d\n",i,sum);
        sum = 0;    
    }
}