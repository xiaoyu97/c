/*
输入两个整数，如果两数值相等，则显示“A和B相等。”。如果A大于B,则显示“A大于B。”。如果A小于B,则显示“A小于B。
*/
#include <stdio.h>
int main(void) {
    int a, b;
    printf("整数a,整数b\n");
    scanf("%d,%d", &a , &b);

    if (a == b)
        puts("a和b相等");
    else if (a > b)
        puts("a大于b");
    else
        puts("a小于b");

    return 0;
}