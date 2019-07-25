/*
将两个整数的值按升序排列
*/
#include <stdio.h>

void swap(int *px, int *py) {
    int t;
    t = *px;
    *px = *py;
    *py = t;
}
void sort2(int *n1, int *n2) {
    if (*n1 > *n2)
        swap(n1, n2);
}

int main(void) {
    int n1, n2;
    puts("请输入两个整数：");
    printf("整数1: 整数2:"); scanf("%d,%d", &n1, &n2);

    sort2(&n1, &n2);

    printf("两个整数从小到大的排序是%d<%d。\n", n1, n2);

    return 0;

}