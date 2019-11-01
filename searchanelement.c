#include<stdio.h>

void main()
{
    int n;
    printf("Enter number of elements : ");
    scanf("%d",&n);
    
    int arr[n];
    
    printf("Enter elements one by one - ");
    
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    
    int number;
    printf("Please enter number to be searched : ");
    scanf("%d", &number);
    
    for(int i=0;i<n;i++)
    {
        if(arr[i]==number)
        {
            printf("Element %d present in an array at %d position", number,i+1);
            break;
        }
        else 
            return 0;
    }
}