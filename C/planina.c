#include<stdio.h>
#include<math.h>

int main(void)
{
    int in;
    scanf("%d", &in);

    in = pow(2, in) +1;
    in = pow(in, 2);
    
    printf("%d \n", in);
}
