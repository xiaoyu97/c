/*
显示从1到输入整数的值的二次方
*/
#include <stdio.h>
int main(void) {
    int a;
    int n;
    int i;
    printf("输入一个整数：");
    scanf("%d", &n);

    for (a = 1; a <= n; a++) {
        i = a * a;
        printf("%d的二次方是%d。\n", a, i);

    }
    return 0;
}