/*将和有n个元素的数组v中的key相等的所有元素的下标存储在数组idx中，返回和key相等的元素的个数。
*/
#include <stdio.h>
#define NUM 5
#define FAILED -1

int search_idx( int v[], int idx[], int key, int n) {
    int i;
    int y = 0;
    for (i = 0; i < n; i++)
        if (v[i] == key) {
            idx[y] = i;
            y++;
        }
    return y;
}

int main(void) {
    int i, key, a;
    int v[NUM];
    int idx[NUM];

    for (i = 0; i < NUM; i++) {
        printf("v[%d]:", i);
        scanf("%d", &v[i]);
    }
    printf("要查找的值：");
    scanf("%d", &key);

    a = search_idx(v, idx, key, NUM);

    printf("idx数组里的元素为：");
    if (a == FAILED)
        puts("查找失败！！！");
    else
        for (i = 0; i < a; i++)

            printf("%d", idx[i]);
    printf(" key的值为%d,他在v数组的个数为%d,\n", key, a);
    return 0;

}