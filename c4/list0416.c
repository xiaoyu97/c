/*
连续显示输入数的个数*
*/
#include <stdio.h>
int main(void) {
    int no;

    printf("输入一个正数：");
    scanf("%d", &no);

    while (no-- > 0)
        putchar('*');
    putchar('\n');

    return 0;
}