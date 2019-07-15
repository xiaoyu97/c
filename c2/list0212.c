/*
	验证各种常量的运算

	*/
#include <stdio.h>
int main(void) {
    int    n1, n2;
    double d1, d2;

    puts("请输入4个数。");
    printf("整数n1:"); scanf("%d", &n1);
    printf("整数n2:"); scanf("%d", &n2);
    printf("实数d1:"); scanf("%lf", &d1);
    printf("实数d2:"); scanf("%lf", &d2);

    printf("整数的和是%d 积是%d。", n1 + n2, n1 * n2);
    printf("实数的和是%f 积是%f。", d1 + d2, d1 * d2);

    return 0;

}