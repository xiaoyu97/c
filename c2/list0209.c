#include <stdio.h>
int main(void) {
    double x, y;
    puts("请输入两个数。");
    printf("实数x:"); scanf("%lf", &x);
    printf("实数y:"); scanf("%lf", &y);

    printf("x + y = %f\n", x + y);
    printf("x - t = %f\n", x - y);
    printf("x * y = %f\n", x * y);
    printf("x / y = %f\n", x / y);
    return 0;
}