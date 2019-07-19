/*
求三个数中最大的值
*/
#include <stdio.h>

/*返回三个整数中的最大值*/
int max3 (int a, int b, int c) {
    int max = a;
    if (b > max)
        max = b;
    if (c > max)
        max = c;
    return max;
}
int main(void) {
    int a, b, c;

    puts("请输入三个数。");
    printf("整数a: 整数b: 整数c:\n");
    scanf("%d,%d,%d", &a, &b, &c);

    printf("最大的数的值是%d。\n", max3(a, b, c));

    return 0;
}