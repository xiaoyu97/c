/*
从0到输入的数的和
*/
#include <stdio.h>
int main(void) {
    int no, i;
    int num = 0;

    printf("输入一个整数：");
    scanf("%d", &no);

    for (i = 0; i <= no; i++) {
        num = num + i;
    } printf("和是：%d。\n", num);
    return 0;
}