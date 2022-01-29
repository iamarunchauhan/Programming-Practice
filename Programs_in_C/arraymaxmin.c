#include<stdio.h>

void main()
{
    int n, max, min;
    printf("Enter number of elements in an array :");
    scanf("%d",&n);
    
    int arr[n];
    
    printf("Enter elements one by one : ");
    
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    
    max  = min = arr[0];
    
    for(int i = 0; i < n; i++)
    {
        if(max < arr[i])
        {
            max = arr[i];
        }
        
        if(min > arr[i])
        {
            min = arr[i];
        }
    }
    
    printf("%d is maximum element\n",max);
    printf("%d is minimum element",min);
}