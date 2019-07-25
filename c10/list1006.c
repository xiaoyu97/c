/*
将两个整数值互换
*/
#include <stdio.h>

void swap(int *a, int *b) {
    int t;
    t = *a;
    *a = *b;
    *b = t;
}

int main(void) {
    int a, b;

    printf("请输入两个整数：\n");
    printf("整数1： 整数2："); scanf("%d,%d", &a, &b);

    swap(&a, &b);

    printf("交换后的整数1为%d,整数2为%d。\n", a, b);

    return 0;
}