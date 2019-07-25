/*
哨兵查找
*/
#include <stdio.h>

#define NUM 5/*元素个数*/
#define FAILED -1 /*元素查找失败*/

/*查找元素数为n的数组v中与key一致的元素*/
int search( int v[], int key, int n) {
    int i = 0;
    v[n] = key;
    while (1) {
        if (v[i] == key)
            break;
        i++;
    }
    return (i < n) ? i : FAILED;
}

int main(void) {
    int i, ky, idx;
    int vx[NUM + 1];

    for (i = 0; i < NUM; i++) {
        printf("vx[%d]:", i);
        scanf("%d", &vx[i]);
    }

    printf("要查找的值：");
    scanf("%d", &ky);

    idx = search(vx, ky, NUM);

    if (idx == FAILED)
        puts("查找失败！！！");
    else
        printf("%d是数组的第%d号元素\n", ky, idx + 1);

    return 0;

}