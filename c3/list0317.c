/*
显示所输入的两个整数中比较大的值
*/
#include <stdio.h>
int main(void) {
    int n1, n2;
    puts("请输入两个整数：");
    printf("整数1:整数2:\n"); scanf("%d,%d", &n1, &n2);

    if (n1 > n2)
        printf("较大的数是%d。\n", n1);
    else
        printf("较大的数是%d。\n", n2);

    return 0;
}