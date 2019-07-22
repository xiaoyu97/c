/*
显示九九乘法表并加上横纵标题
*/
#include <stdio.h>
int main(void) {
    int a, b;

    printf(" |");
    for (a = 1; a <= 9; a++)
        printf("%3d", a);
    putchar('\n');

    for (a = 1; a <= 9; a++)
        printf("---");
    putchar('\n');


    for (a = 1; a <= 9; a++) {
        printf("%d |", a);
        for (b = 1; b <= 9; b++) {
            printf("%3d", a * b);

        } putchar('\n');

    } putchar('\n');
}