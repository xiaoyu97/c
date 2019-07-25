/*
计算两个整数的和与差
*/
#include <stdio.h>

/*将n1和n2的和，差分别保存至*sum和*diff*/
void sum_diff(int n1, int n2, int *sum, int *diff) {
    *sum = n1 + n2;
    *diff = (n1 > n2) ? (n1 - n2) : (n2 - n1);
}
int main(void) {
    int n1, n2;
    int sum = 0;
    int diff = 0;

    puts("请输入两个整数：");
    printf("n1: n2: "); scanf("%d,%d", &n1, &n2);

    sum_diff(n1, n2, &sum, &diff);

    printf("两数之和是%d,两数之差是%d。\n", sum, diff);

    return 0;
}