#import<stdio.h>

int main(void)
{
    int people, chicken, pieces;
    
    scanf("%d %d", &people, &chicken);
    pieces = chicken - people;
    
    if(pieces >= 0)
    {
        if(pieces == 1)
        {
            printf("Dr. Chaz will have %d piece of chicken left over!\n", pieces);

        }
        else
        {
        printf("Dr. Chaz will have %d pieces of chicken left over!\n", pieces);
        }
    }
    else
    {
        if (pieces == -1)
        {
            printf("Dr. Chaz needs %d more piece of chicken!\n", -pieces);
        }
        else
        {
        printf("Dr. Chaz needs %d more pieces of chicken!\n", -pieces);
        }
    }
}
