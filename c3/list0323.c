/*
显示输入的四个整数之中最大值并显示
*/
#include <stdio.h>
int main(void) {
    int n1, n2, n3 ,n4, max;

    puts("请输入四个整数：");
    printf("整数1:整数2:整数3整数4\n");
    scanf("%d,%d,%d,%d", &n1, &n2, &n3, &n4);

    max = n1;
          if (max < n2) max = n2;
    if (max < n3) max = n3;
    if (max < n4) max = n4;

    printf("最大值是%d。\n",max);

    return 0;
}