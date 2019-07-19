/*
计算两个整数的平方差
*/
#include <stdio.h>
/*返回x的平方*/
int spr(int x) {
    return x * x;
}
/*返回x和y的差值*/
int diff(int a, int b) {
    return (a > b ? a - b : b - a);
}
int main(void) {
    int x, y;
    puts("请输入两个整数。");
    printf("整数x: 整数y:\n");
    scanf("%d,%d", &x, &y);

    printf("x和y的平方差是%d。\n", diff(spr(x), spr(y)));
    return 0;
}