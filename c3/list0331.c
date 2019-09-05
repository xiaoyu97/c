/*
输入三个数，分别显示三个值都相等、有两个值相等、三个值都不同。
*/
#include <stdio.h>
int main(void) {
    int n1, n2, n3;

    puts("请输入三个数：");
    printf("整数1:整数2:整数3:\n");
    scanf("%d,%d,%d", &n1, &n2, &n3);

    if (n1 == n2 && n2 == n3)
        printf("三个值都想等！");
    else if (n1 == n2 || n1 == n3 || n2 == n3)
        printf("有两个值相等！");
    else
        printf("三个值都不同！！！");
    return 0;
}