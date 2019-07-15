/*
逆向显示输入的值，并显示输入的值
*/
#include <stdio.h>
int main(void) {
    int no;
    do {
        printf("输入一个正整数：");
        scanf("%d", &no);
        if (no <= 0)
            puts("请不要输入非正整数！");
    } while (no <= 0);

    printf("该整数是%d。\n", no);
    printf("该整数的逆向显示结果是：");
    while (no > 0) {
        printf("%d", no % 10);
        no /= 10;
    }
    puts("。");
    return 0;

}