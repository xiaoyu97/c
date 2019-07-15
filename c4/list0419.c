/*
交替显示+和-，总个数等于所输入的整数值*/
#include <stdio.h>
int main(void) {
    int no;
    int i = 0;

    printf("输入一个整数");
    scanf("%d", &no);

    while (i < no) {
        if (i % 2 == 0)
            printf("+");
        else
            printf("-");
        i++;
    } return 0;
}
