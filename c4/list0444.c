/*显示输入整数层的向下的金字塔形状
*/

#include <stdio.h>
int main(void) {
    int a, b, c;
    int n;

    puts("让我们来画一个向下的金字塔");
    printf("金字塔有几层：");
    scanf("%d", &n);

    c = n;
    for (a = 1; a <= n; a++) {
        for (b = 1; b <= a-1 ; b++)
            putchar(' ');
        for (b = 1; b <= 2 * c - 1; b++)
            printf("%d", a );
        c--;
        putchar('\n');
    }



    return 0;
}