/*
计算输入三个整数的最小值并显示
*/
#include <stdio.h>
int main(void) {
    int n1, n2,n3;

    puts("请输入三个整数：");
    printf("整数1:整数2:整数3 \n");
    scanf("%d,%d,%d",&n1, &n2, &n3);

    printf("最小值是%d。\n",n2 < n3 ? n2 : (n3 < n1 ? n3 : (n1 < n2 ? n1 : n2)));
    return 0;
}