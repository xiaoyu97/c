/*
编写一段程序，根据输入的整数，循环显示 1234567890 ，显示的位数和输入的整数值相同
*/
#include <stdio.h>
int main(void) {
    int a;
    int i;

    printf("请输入一个整数：");
    scanf("%d", &a);

    for (i = 1; i <= a; i++) {
        printf("%d", i % 10);
    }
    putchar('\n');
    return 0;
}