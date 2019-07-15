/*
输入两个整数，显示他们的差小于等于10或显示他们的差大于等于11
*/
#include <stdio.h>
int main(void) {
    int a, b;
    puts("请输入两个整数：");
    printf("整数1:整数2:\n");
    scanf("%d,%d", &a, &b);

    if (a - b <= 10 || b - a >= 10)
        printf("他们的差小于等于10。\n");
    else
        printf("它们的差大于10。\n");
    return 0;


}