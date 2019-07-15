/*
从0到输入的数的和
*/
#include <stdio.h>
int main(void) {
    int no, i, num;

    printf("输入一个整数：");
    scanf("%d", &no);

    for (i = 0; i <= no; i++) {
        num = num + i;
    } printf("和是：%d", num);
    return 0;
}