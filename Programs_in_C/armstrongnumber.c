#include<stdio.h>
#include<math.h> // math.h will be used as we are computing power of every digit

void main()
{
    int number, result;
    int rem = 0,sum = 0, power = 0;
    
    //input 3-digit number from user
    printf("Enter 3-digit number - ");
    scanf("%d",&number);
    
    //copy the value in variable number to result 
    result = number;
    
    
    while(number!=0)
    {
        rem = number % 10; // it store every digit of a number while looping   
        power = pow(rem,3); 
        sum = sum + power; 
        number = number / 10;
    }
    
    //if computed output & number input by user then it's a Armstrong Number
    if (sum==result)
        printf("The entered number %d is an Armstrong Number", result);
    else
        printf("Number %d is not an Armstrong Number", result);
}