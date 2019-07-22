/*
使用sqr函数创建另一个函数，返回int型整数的四次幂
*/
#include <stdio.h>
int sqr(int x) {
    return x * x;
}
int pow4 (int y) {
    return sqr(y) * sqr(y);

}
int main(void) {
    int a;
    printf("请输入一个整数：");
    scanf("%d", &a);
    printf("它的四次幂是：%d。\n", pow4(a));
    return 0;
}