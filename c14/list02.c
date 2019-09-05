#include <stdio.h>
int main(void) {
    int a, b;
    puts("输入两个整数");
    printf("请输入第一个正整数：\n");
    scanf("%d", &a);
    printf("请输入第二个正整数：\n");


    scanf("%d", &b);

    printf("a+b=%d。\n", a + b);
    return 0;
}