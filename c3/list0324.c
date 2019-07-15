/*
显示输入两个整数的差并显示
*/
#include <stdio.h>
int main(void) {
    int n1, n2, max;
    puts("请输入两个整数：");
    printf("整数1:整数2:\n");
    scanf("%d,%d", &n1, &n2);

    max = n1;
    if (n2 > max)
        printf("它们的差是%d。\n", n2 - max);
    else
        printf("它们的差是%d。\n", max - n2);
    return 0;
}