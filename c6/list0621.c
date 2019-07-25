/*对元素个数为n的int型数组v进行倒序排列
*/
#include <stdio.h>

/*对元素个数为n的数组v进行倒序排列*/
void rev_intary(int v[], int n) {
    int i;
    int tmp;
    for (i = 0; i < n / 2; i++) {
        tmp = v[i];
        v[i] = v[n - i - 1];
        v[n - i - 1] = tmp;
    }
}

int main(void) {
    int n;
    int a[100];
    int i;

    printf("请输入数组的元素的个数：");
    scanf("%d", &n);

    printf("请输入数组元素的值\n");
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);

    rev_intary(a, n);

    printf("输入的数组元素的值\n");
    for (i = 0; i < n; i++)
        printf("%d", a[i]);
    putchar('\n');

    return 0;
}