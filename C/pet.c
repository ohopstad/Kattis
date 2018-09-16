#import<stdio.h>

int main(void)
{
    int a, b, c, d, sum = 0, i = 1;
    int ans[2] = {0, 0};
    while(i<6)
    {
        scanf("%d %d %d %d", &a, &b, &c, &d);
        sum = a+b+c+d;
        if(sum > ans[1])
        {
            ans[0] = i;
            ans[1] = sum;
        }
        i++;
    }
    printf("%d %d\n", ans[0], ans[1]);
}
