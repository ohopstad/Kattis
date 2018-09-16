#include<stdio.h>
#include<math.h>
#include<string.h>

int main(void)
{
    float W, H;
    unsigned int N;
    char out[1600];
    scanf("%d %f %f", &N, &W, &H);
    float max = sqrt((W*W) + (H*H));
    float val;
    
    while(N)
    {
        scanf("%f", &val);
        if(val > max)
        {
            strcat(out, "NE\n");
        }
        else
        {
            strcat(out, "DA\n");
        }
        N--;
    }
    
    printf("%s",  out);
}
