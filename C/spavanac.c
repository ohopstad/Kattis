#include<stdio.h>

int main(void)
{
    signed int H, M, i = 45;
    scanf("%d %d", &H, &M);
    
    while(i)
    {
        M--;
        if(M == -1)
        {
            M = 59;
            H--;
            if(H == -1)
            {
                H = 23;
            }
        }
        i--;
    }
    
    printf("%d %d \n", H, M);
}
