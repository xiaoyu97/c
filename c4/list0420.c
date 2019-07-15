/*
连续显示*，总个数等于所输入的整数值
*/
#include <stdio.h>
int main(void) {
    int no;
    int i = 0;

    printf("输入一个整数：");
    scanf("%d", &no);

    while (i < no) {
        putchar('*');
        putchar('\n');
        i++;
    } return 0;
}