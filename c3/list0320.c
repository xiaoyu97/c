/*
显示所输入的两个整数中较大的值
*/
#include <stdio.h>
int main(void) {
    int n1, n2, max;

    puts("请输入两个整数：");
    printf("整数1:整数2：\n");
    scanf("%d,%d",&n1, &n2);

    max = (n1 > n2) ? n1 : n2;

    printf("较大的数是%d。\n", max);

    return 0;

}