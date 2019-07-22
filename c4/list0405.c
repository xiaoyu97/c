/*
不停的输入整数，显示其和及平均值
*/
#include <stdio.h>
int main(void) {
    int a;
    int sum = 0;
    int cnt = 0;
    int retry;
    do {
        printf("请输入一个整数：");
        scanf("%d", &a);
        sum = sum + a;
        cnt = cnt + 1;

        printf("是否继续Y...0/N...9:");
        scanf("%d", &retry);

    } while (retry == 0);
    printf("和是：%d平均值是：%f。\n", sum, (double)sum / cnt);
    return 0;

}