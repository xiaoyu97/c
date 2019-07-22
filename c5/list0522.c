/*
求六名学生的两门分数的总分和平均分，以及学生的总分和平均分
*/
#include <stdio.h>
int main(void) {
    int i, j;
    int sum = 0; /*学生总分*/
    int b = 0;/*语文总分*/
    int c = 0;/*数学总分*/
    int a[2][6];

    printf("请输入12个分数\n");
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 6; j++)
            scanf("%d", &a[i][j]);
    }
    i = 0;
    for (j = 0; j < 6; j++)
        b += a[i][j];
    printf("语文的总分是%d,平均分是%.2f。\n", b, (double) b / 6);

    i = 1;
    for (j = 0; j < 6; j++)
        c += a[i][j];
    printf("数学的总分是%d,平均分是%.2f。\n", c, (double)c / 6);

    j = 0;
    do {
        for (i = 0; i < 2; i++)
            sum += a[i][j];

        printf("第%d名学生的分数为%d,平均分为%.2f。\n", j + 1, sum / (j + 1) , (double) (sum / 2) / (j + 1) );
        j++;
    } while ( j < 6);
    return 0;


}