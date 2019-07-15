/*
输入一个整数，连续显示出该整数个*
*/
#include <stdio.h>
int main(void) {
    int no, i;

    printf("输入一个整数：");
    scanf("%d", &no);

    for (i = 0; i <= no; i++)
        putchar('*');
    putchar('\n');
    return 0;
}