/*
数组的传递
*/
#include <stdio.h>
/*将数组v里的n个元素赋值为val*/
void sry_set(int v[], int n, int val) {
    int i;
    for (i = 0; i < n; i++)

        v[i] = val;
}
/*
void sry_set(int *v, int n, int val) {
    int i;
    for (i = 0; i < n; i++)
        *(v + i) = val;
}
*/
int main(void) {
    int i;
    int v[5] = {1, 2, 3, 4, 5};

    sry_set(&v[2], 2, 99);

    for (i = 0; i < 5; i++)
        printf("v[%d]=%d。\n", i, v[i]);

    return 0;
}