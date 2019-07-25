/*
将n1、n2、n3指向的三个int型整数按升序排列。
*/
#include <stdio.h>

void sort3(int *n1, int *n2, int *n3) {
    int t;


    if (*n1 > *n2) {
        t = *n2;
        *n2 = *n1;
        *n1 = t;
    }
    if (*n2 > *n3) {
        t = *n3;
        *n3 = *n2;
        *n2 = t;
    } if (*n1 > *n3) {
        t = *n3;
        *n3 = *n1;
        *n1 = t;
    }
}

int main(void) {
    int n1, n2, n3;

    puts("请输入三个正整数");
    printf("整数1: 整数2: 整数3:");
    scanf("%d,%d,%d", &n1, &n2, &n3);

    sort3(&n1, &n2, &n3);

    printf("三个整数从小到大的排序是%d<%d<%d。\n", n1, n2, n3);

    return 0;
}