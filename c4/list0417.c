/*
输入一个整数，连续显示出该整数个*
*/
#include <stdio.h>
int main(void) {
    int no;

    printf("输入一个整数：");
    scanf("%d", &no);

    if (no >= 1) {
        while (no-- > 0)
            putchar('*');
        putchar('\n');
    } return 0;
}