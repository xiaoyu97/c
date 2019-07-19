/*
求三个数的最小值
*/
#include <stdio.h>
int min3(int a, int b, int c) {
    int min = a;
    if (min > b)
        min = b;
    if (min > c)
        min = c;
    return min;

}
int main(void) {
    int a, b, c;

    puts("请输入三个整数：");
    printf("整数a: 整数b: 整数c:\n");
    scanf("%d,%d,%d", &a, &b, &c);

    printf("最小的数的值是%d。\n", min3(a, b, c));
    return 0;
}