/*
求两个数中的最小值
*/
#include <stdio.h>

/*返回两个数中的最小值*/
int min2(int a, int b) {
    if (a < b)
        return a;
    else
        return b;
}
int main(void) {
    int a, b;

    puts("请输入两个整数：");
    printf("整数a: 整数b：\n");
    scanf("%d,%d", &a, &b);

    printf("较小的数的值是%d。\n", min2(a, b));

    return 0;
}