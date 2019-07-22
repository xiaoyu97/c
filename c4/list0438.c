/*
画一个长方形
*/
#include <stdio.h>
int main(void) {
    int a;
    int b;
    int height, width;

    printf("输入长方形的长和宽：");
    scanf("%d,%d", &height, &width);

    for (a = 1; a <= height; a++) {
        for (b = 1; b <= width; b++)
            putchar('*');
        putchar('\n');
    }
    return 0;
}