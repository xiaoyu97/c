/*
编写一段程序，读取数组中的数据个数和元素值并显示。显示时，各值之间用逗号和空格分割，并用大括号将所有值括起来
*/
#include <stdio.h>
#define NUMBER 5
int main(void) {
    int i;
    int a[NUMBER] = {1, 2, 3, 4, 5};

    putchar('{');
    for (i = 0; i < NUMBER; i++)
        printf("%d,  ", a[i]);
    putchar('}');

    return 0;

}