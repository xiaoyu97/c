/*
金子塔*/
#include <stdio.h>
int main(void) {
    int i, j;
    int len;

    printf("金字塔有几层：");
    scanf("%d", &len);

    for (i = 1; i <= len; i++) {
        for (j = 1; j <= len - i; j++)
            printf(" ");
        for (j = 1; j <= i * 2 - 1; j++)
            printf("*");
        printf("\n");
    }
    return 0;
}