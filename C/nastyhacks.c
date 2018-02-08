#include<stdio.h>
#include<string.h>

int main(void)
{
signed int i, wout, with, cost;

char out[1600];
scanf("%d", &i);


while(i)
{
	scanf("%d %d %d", &wout, &with, &cost);
	with -= cost;
	if (with == wout){
		strcat(out, "does not matter\n");
	}
	else if(with > wout){
		strcat(out, "advertise\n");
	}
	else{
		strcat(out, "do not advertise\n");
	}
	i--;
}
printf("%s", out);
}
