#include<stdio.h>
#include<string.h>

int main(void)
{
    int num_of_pairs = 0, speed, time, time_prev, val;
    char ans[16000], temp[1000];
    scanf("%d", &num_of_pairs);
    while(num_of_pairs != -1)
    {
        val = 0;
        time_prev = 0;
        for(int i = 0; i < num_of_pairs;  i++)
        {
            scanf("%d %d", &speed, &time);
            val += speed* (time- time_prev);
            time_prev = time;
        }
        sprintf(temp, "%d miles\n", val);
        strcat(ans, temp);

        // continue: 
        scanf("%d", &num_of_pairs);
    }
    printf("%s", ans);
}