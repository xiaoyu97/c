/*
计算幂
*/

/*返回x的n次幂*/
#include <stdio.h>
double power(double x, int n) {
    int i;
    double tmp = 1.0;

    for (i = 1; i <= n; i++)
        tmp *= x;
    return tmp;
}
int main(void) {
    double a;
    int b;

    printf("求a的b次幂\n");
    printf("实数a： 实数b：");
    scanf("%lf,%d", &a, &b);

    printf("%.2f的%d次幂是%.2f。\n", a, b, power(a, b));
    return 0;
}
