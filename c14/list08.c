#include <stdio.h>
int main(void) {
    int a;
    int b = 0;
    printf("请输入一个正整数：");
    scanf("%d", &a);

    while (a>0) {
        b = b * 10 + a % 10;
        a = a / 10;
    }
    printf("a的反向值为：%d。\n", b);
    return 0;

}