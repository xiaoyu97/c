/*
输入规定个数整数并显示出它们的合计值和平均值(for)
*/
#include <stdio.h>
int main(void) {
    int i = 0;
    int sum = 0; /*和*/
    int num, tmp;
    printf("输入多少个整数：");
    scanf("%d", &num);

    for (i = 0; i < num; i++) {
        printf("No.%d", tmp);
        scanf("%d",&tmp);
        sum = sum + tmp;

    } printf("它们的和是%d。\n", sum);
    printf("它们的平均值是%.2f。\n", (double)sum / num);

    return 0;
}