/*
不停的输入整数，显示其和及平均值
*/
#include <stdio.h>
int main(void) {
    int sum = 0;/*和*/
    int cnt = 0;/*输入的个数*/
    int retry;

    do {
        int t;
        printf("输入一个整数：");
        scanf("%d", &t);
        sum += t;
        cnt ++;

        printf("是否继续？【yes...0/no...9】：");
        scanf("%d", &retry);

    } while (retry == 0);
    printf("它们的和是%d,平均值是%.2f\n", sum, (double)sum / cnt);
    return 0;
}