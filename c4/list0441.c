/*
显示出一个横向较长的长方形
*/
#include <stdio.h>
int main(void) {
    int a, b;
    int i, j;
    int max, min;

    puts("让我们来画一个长方形");
    printf("一边："); scanf("%d", &i);
    printf("另一边："); scanf("%d", &j);

    max = i;
    if (i < j) {
        max = j;
        min = i;
    } else {
        max = i;
        min = j;
    }

    for (a = 1; a <= min; a++) {
        for (b = 1; b <= max; b++)
            putchar('*');
        putchar('\n');
    } putchar('\n');
    return 0;
}
