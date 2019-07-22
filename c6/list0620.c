/*
返回元素个数为n的int型数组v中的最小值。
*/
#include <stdio.h>
#define NUM 5

/*返回元素个数为n的数组v中的最小值*/
int min_of(const int v[], int n) {
    int i;
    int min = v[0];

    for (i = 1; i < n; i++)
        if (v[i] < min)
            min = v[i];
    return min;
}

int main(void) {
    int i;
    int a[NUM];

    printf("请输入%d个整数。\n", NUM);
    for (i = 0; i < NUM; i++) {
        printf("%d：", i + 1);
        scanf("%d", &a[i]);
    }


    printf("最小值为%d。\n", min_of(a, NUM));

    return 0;

}