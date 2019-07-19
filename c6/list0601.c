/*
求两个整数中较大的值
*/
#include <stdio.h>

/*返回较大整数的值*/
int max2(int a, int b) {
    if (a > b)
        return a;
    else
        return b;
}
int main(void) {
    int n1, n2;

    puts("请输入两个整数。");
    printf("整数1: 整数2:\n");
    scanf("%d,%d", &n1, &n2);

    printf("较大的整数是%d。\n", max2(n1, n2));

    return 0;

}