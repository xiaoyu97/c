/*
显示输入的三个整数之中的最小值并显示
*/
#include <stdio.h>
int main(void) {
    int n1, n2, n3, min;

    puts("请输入三个整数：");
    printf("整数1:整数2:整数3:\n");
    scanf("%d,%d,%d", &n1, &n2, &n3);

    min = n1;
    if (min > n2)
        min = n2;
    if (min > n3)
        min = n3;

    printf("最小值是%d.\n", min);
    return 0;

}