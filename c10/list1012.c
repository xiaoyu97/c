/*
下标运算符和指针运算符
*/
#include <stdio.h>

int main(void) {
    int i;
    int a[4];

    0[a] = a[1] = *(a + 2) = *(3 + a) = 7;

    for (i = 0; i < 4; i++)
        printf("a[%d]=%d", i, a[i]);

    return 0;
}