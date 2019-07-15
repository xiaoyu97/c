/*
输入两个整数，前者是不是后者的约数
*/
#include <stdio.h>
int main(void) {
    int a, b;
    printf("请输入两个整数：");
    printf("整数a,整数b\n"); scanf("%d,%d", &a,&b);

    if (a % b)
        puts("b不是a的约数。");
    else
        puts("b是a的约数。");
    return 0;
}
