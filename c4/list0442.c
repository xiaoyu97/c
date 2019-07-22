/*
分别显示出直角在左上方和右上方的等腰直角三角形（生成两个程序）。
*/
#include <stdio.h>
int main(void) {
    int a, b;
    int len;

    // puts("生成直角左上角的等腰直角三角形。");
    // printf("短边为：");
    // scanf("%d", &len);

    // for (a = 1; a <= len; a++) {
    //     for (b = len - a; b >= 0; b--)
    //         putchar('*');
    //     putchar('\n');
    // } putchar('\n');
    // return 0;

    puts("生成直角右上角的等腰直角三角形。");
    printf("短边为：");
    scanf("%d", &len);

    for (a = 1; a <= len; a++) {
        for (b = 1; b <= a - 1; b++)
            putchar(' ');

        for (b = a; b <= len; b++)
            putchar('*');
        putchar('\n');


    } return 0;
}