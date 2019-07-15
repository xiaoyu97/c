/*
显示出小于输入的整数的所有2的乘方
*/
#include <stdio.h>
int main(void) {
    int no;
    int i = 2;

    printf("请输入一个正整数：");
    scanf("%d", &no);

    while (i < no) {

        printf("%d。\n", i);



        i = i * 2;

    }
    return 0;
}