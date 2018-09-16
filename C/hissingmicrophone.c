#include<stdio.h>
int main(void)
{
    char input[30];
    scanf("%s", input);
    
    int s = 0;
    for (int i = 0; input[i] != 0; i++)
    {
        if (input[i] == 's')
        {
            if (input[i+1] == 's')
            {
                s = 1;
                break;
            }
        }
    }
    if(s)
    {
        printf("hiss \n");
    }
    else{
        printf("no hiss \n");
    }
}
