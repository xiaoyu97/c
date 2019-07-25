/*
显示对象的地址
*/
#include <stdio.h>
int main(void) {
    int n;
    int x;
    int a[3];

    printf("n的地址是：%p。\n", &n);
    printf("x的地址是：%p。\n", &x);
    printf("a[0]的地址是：%p。\n", &a[0]);
    printf("a[1]的地址是：%p。\n", &a[1]);
    printf("a[2]的地址是：%p。\n", &a[2]);

    return 0;

}