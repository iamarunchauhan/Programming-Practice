#include<stdio.h>

void main()
{
    int n, even, odd;
    printf("Enter number of elements in an array :");
    scanf("%d",&n);
    
    int arr[n];
    
    printf("Enter elements one by one : ");
    
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    
    even = odd = 0;
    
    for(int i = 0; i < n; i=i+2)
    {
       even +=arr[i]; 
    }
    
    for(int i = 1; i < n; i=i+2)
    {
       odd +=arr[i]; 
    }
    
    printf("%d is sum of even elements\n",even);
    printf("%d is sum of odd element",odd);
}