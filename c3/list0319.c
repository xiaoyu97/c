/*
计算所输入的三个数中最大的值并显示
*/
#include <stdio.h>
int main(void) {
    int n1, n2, n3, max;

    puts("请输入三个整数：");
    printf("整数1:整数2:整数3:\n");
    scanf("%d,%d,%d", &n1, &n2, &n3);

    max = n1;
    if (n2 > max)
        max = n2;
    if (n3 > max)
        max = n3;

    printf("最大的值是%d。\n", max);

    return 0;
}