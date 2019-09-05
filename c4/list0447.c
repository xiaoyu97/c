/*直角在右上角的直角三角形*/
#include <stdio.h>
int main(void) {
    int i, j;
    int len;

    printf("请输入高度：");
    scanf("%d", &len);

    for (i = 1; i <= len; i++) {
        for (j = 1; j < i; j++)
            printf(" ");
        for (j = 1; j <= len + 1 - i; j++)
            printf("*");
        putchar('\n');
    }
    return 0;
}