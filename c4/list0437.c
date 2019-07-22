/*
显示输入值的所有约数和约数个数
*/
#include <stdio.h>
int main(void) {
    int a;
    int b;
    int i = 0;

    printf("输入一个整数：");
    scanf("%d", &b);

    for (a = 1; a <= b; a++) {
        if (b % a == 0) {
            printf("%d\n", a);

            i++;
        }
    } printf("约数有%d个。\n", i);

    return 0;


}