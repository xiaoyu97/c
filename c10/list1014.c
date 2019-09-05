/*
接收元素类型为int型、元素个数为n的数组v，并为所有元素赋上和下标相同的值。
*/
#include <stdio.h>

void set_idx(int *v, int n) {
    int i;
    for (i = 0; i < n; i++)
        *(v + i) = i;
}

int main(void) {
    int i;
    int v[5] = {1, 2, 3, 4, 5};

    set_idx(v, 5);

    for (i = 0; i < 5; i++)
        printf("v[%d]=%d。\n", i, v[i]);

    return 0;
}