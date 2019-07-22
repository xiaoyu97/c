/*
显示所输入整数为边长的正方形
*/
#include <stdio.h>
int main(void) {
    int a;
    int b;

    int width;

    printf("生成一个正方形\n");
    printf("长为：");
    scanf("%d", &width);

    a = b;
    for (a = 1; a <= width; a++) {
        for (b = 1; b <= width; b++)
            putchar('*');
        putchar('\n');

    } putchar('\n');
    return 0;
}