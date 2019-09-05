/*
冒泡排序
*/
#include <stdio.h>

#define NUM 5

/*交换px和py所指对象的值*/
void swap(int * px, int * py) {
    int t;
    t = *px;
    *px = *py;
    *py = t;
}
/*冒泡排序*/
void bsort(int a[], int n) {
    int i, j;
    // int point[NUM];

    for (i = 0; i < (n - 1); i++) {
        for (j = 0; j < n - 1 - i; j++)
            if (a[j] > a[j + 1])
                swap(&a[j + 1], &a[j]);
    }
}
int main(void) {
    int i;
    int point[NUM];/*NUM名学生的分数*/

    printf("请输入%d人的分数。\n", NUM);
    for (i = 0; i < NUM; i++) {
        printf("%2d号：", i + 1);
        scanf("%d", &point[i]);
    }

    bsort(point, NUM);

    puts("按升序排列。");
    for (i = 0; i < NUM; i++)
        printf("%2d号：%d\n", i + 1, point[i]);

    return 0;
}