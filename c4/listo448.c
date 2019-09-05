/*
给九九乘法表加标题
*/
#include <stdio.h>
int main(void) {
    int a, b;

    printf("|");
    for (a = 1, a <= 9; a++)
        printf("%3d\n", a);
    printf("---------------------");

    for (a = 1; a <= 9; a++) {
        printf("%d |", a);
        for (b = 1; b <= 9; b++)
            printf("%d", a * b);
        putchar('\n');
    }

    return 0;
}