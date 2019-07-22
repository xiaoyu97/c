/*创建一个函数，返回1到n之间所有整数的和。*/
#include <stdio.h>
int sumup (int n) {
    int i = 1;
    int sum = 0;
    for (i = 1; i <= n; i++)
        sum += i;
    return sum;
} int main(void) {
    int a;

    puts("输入一个整数：");
    scanf("%d", &a);

    printf("1到%d之间所有整数的和是%d。\n", a, sumup(a));
}