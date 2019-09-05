/*
显示出身高和标准体重的对照表
*/
#include <stdio.h>

int main(void) {
    int a, b, c;
    int i;
    double n;

    printf("请输入开始数值(cm)：");
    scanf("%d", &a);
    printf("请输入结束数值(cm)：");
    scanf("%d", &b);
    printf("请输入间隔数值(cm)：");
    scanf("%d", &c);

    for (i = a; i <= b; i += c) {
        n = (i - 80) * 0.7;
        printf("%dcm	%.2fkg", i, n);
        putchar('\n');
    }

    return 0;
}