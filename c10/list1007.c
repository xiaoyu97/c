/*
n指向的值小于0,就将其改为0:如果值大于100,就将其改为100(如果是0〜100的值，则不修改)。
*/
#include <stdio.h>

void adjust_point(int *n) {
    if (*n < 0)
        *n = 0;
    if (*n > 100)
        *n = 100;
}

int main(void) {
    int n;

    puts("请输入一个正整数");
    scanf("%d", &n);

    adjust_point(&n);

    printf("该整数为%d。\n", n);

    return 0;
}