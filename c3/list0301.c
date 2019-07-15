/*
	输入三个正整数，从小到大排序

*/
#include <stdio.h>
int main(void) {
    int a, b, c, max, min;

    puts("请输入3个正整数：");
    printf("正整数a:"); scanf("%d", &a);
    printf("正整数b:"); scanf("%d", &b);
    printf("正整数c:"); scanf("%d", &c);
    max = a ; min = b;
    if (a < b) {
        max = b;
        min = a;
    } else {
        max = a;
        min = b;
    }

    if (c > max)
        max = c;
    if (c < min)
        min = c;

    printf("它们从小到大的排序是%d< %d< %d\n", min , a + b + c - max - min , max);

    return 0;



}