/*
打印棱形
*/
#include <stdio.h>
int main(void) {
    int i, j;
    int len;

    printf("棱形高是：");
    scanf("%d", &len);

    int m = len;
    for (i = 1; i <= len; i++) {
        for (j = 1; j <= len - i; j++)
            printf(" ");
        for (j = 1; j <= 2 * i - 1; j++)
            printf("*");
        printf("\n");
    }
    for (i = 1; i < len; i++) {
        for (j = 1; j <= i; j++)
            printf(" ");
        for (j = 1; j <= 2 * m - 3; j++)
            printf("*");
        m--;
        printf("\n");
    }


    return 0;
}