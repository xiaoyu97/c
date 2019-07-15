/*
递增显示从0到输入的正整数为止的各个整数
*/
#include <stdio.h>
int main(void) {
    int i, no;
    printf("输入一个正整数：");
    scanf("%d", &no);
    for (i = 0; i <= no; i++)
        printf("%d", i);
    putchar('\n');

    return 0;
}