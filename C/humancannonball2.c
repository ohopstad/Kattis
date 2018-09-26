#include<stdio.h>
#include<math.h>
#include<string.h>

int main(void)
{
    int N = 0;
    float v, theta, x, h1, h2, t, y = 0;
    float pi = 3.14159265358979323846;
    char out[1600] = "";
    scanf("%d", &N);
    for (int i = 0; i < N; i++)
    {
        scanf("%f %f %f %f %f", &v, &theta, &x, &h1, &h2);
        theta = theta*pi/180;
        t = x/(v*cos(theta));
        y = v * t * sin(theta) - (0.5*9.81*(t*t));
        if (y-1 >= h1 && y+1<= h2)
        {
            strcat(out, "Safe \n");
        }
        else{ strcat(out,"Not Safe \n");}
    }
    printf("%s", out);
    return 0;
}
