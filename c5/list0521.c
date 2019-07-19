/*
编写一段程序，求4行3列矩阵和3行4列矩阵的乘积
*/
#include <stdio.h>

int main(void) {
    int i, j, k;
    int sum = 0;
    int tensu1[4][3];
    int tensu2[3][4];
    int tensu3[4][4];

    printf("请输入矩阵1里的数：\n");
    for (i = 0; i < 4; i++)
        for (j = 0; j < 3; j++)
            scanf("%d", &tensu1[i][j]);

    printf("请输入矩阵2里的数：\n");
    for (i = 0; i < 3; i++)
        for (j = 0; j < 4; j++)
            scanf("%d", &tensu2[i][j]);

    for (i = 0; i < 4; i++) {
        for (j = 0; j < 4; j++) {
            for (k = 0; k < 3; k++)
                sum += tensu1[i][k] * tensu2[k][j];
            tensu3[i][j] = sum;

        }
    }
    printf("它们的乘积是：\n");
    for (i = 0; i < 4; i++) {
        for (j = 0; j < 4; j ++ )
            printf("%d", tensu3[i][j]);
        printf("\n");
    }
    return 0;


}