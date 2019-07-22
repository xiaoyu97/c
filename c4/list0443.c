/*
显示输入整数层的金字塔形状
*/
#include <stdio.h>
int main(void) {
    int a, b;
    int i, c;

    puts("让我们来画一个金字塔。");
    printf("金字塔有几层：");
    scanf("%d", &i);

    for (a = 1; a <= i; a++) {
        for (b = 0; b <= i - a ; b++)
            printf(" ");

        for (c = 0 ; c < 2 * (a - 1) + 1; c++)

            printf("*");
        putchar('\n');

    }

    return 0;
}