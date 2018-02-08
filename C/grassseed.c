#include<stdio.h>

int main(void)
{
  double cost, total; 
  int num_of_lawns;
  scanf("%lf", &cost);
  scanf("%d", &num_of_lawns);

  double width, length;
  while(num_of_lawns)
    {
      scanf("%lf %lf", &width, &length);
      total += cost * (width*length);
      num_of_lawns--;
    }
  printf("%#.7lf\n", total);
}
