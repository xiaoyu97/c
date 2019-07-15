/*
从输入的整数开始到数到1
*/
#include <stdio.h>
int main(void) {
    int no;

    printf("请输入一个整数：");
    scanf("%d", &no);
    if (no >= 0) {
        while (no >= 1) {
            printf("%d", no--);
            printf("\n");
        }
    }
    return 0;
}