/*
显示输入两个整数的差并显示
*/
#include <stdio.h>
int main(void) {
    int n1, n2;

    puts("请输入两个整数：");
    printf("整数1；整数2\n");
    scanf("%d,%d", &n1, &n2);

    printf("它们的差是%d。\n", (n1 > n2) ? n1 - n2 : n2 - n1);

    return 0;
}