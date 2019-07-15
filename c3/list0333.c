/*
显示所输入的整数除以3的余数
*/
#include <stdio.h>
int main(void) {
    int no;
    printf("请输入一个整数：");
    scanf("%d", &no);

    if (no % 3 == 0)
        printf("该整数可以被3整除。\n");
    else if (no % 3 == 1)
        printf("该整数除以3的余数是1。\n");
    else
        printf("该整数除以3的余数是2。\n");

    return 0;

}