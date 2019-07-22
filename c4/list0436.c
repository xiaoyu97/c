/*
显示输入的值个“*”，每显示5个就进行换行
*/
#include <stdio.h>
int main(void) {
    int a;
    int b;

    printf("请输入一个整数：");
    scanf("%d", &b);

    for (a = 0; a < b; a++) {
        if (a % 5 == 0)
            putchar('\n');
        putchar('*');

    }
    putchar('\n');
    return 0;

}