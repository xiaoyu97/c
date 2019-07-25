/*对元素个数为n的int型数组v2进行倒序排列，并将其结果保存在数组v1中。
*/
#include <stdio.h>

/*对元素个数为n的int型数组v2进行倒序排列*/
void intary_rcpy (int v1[], const int v2[], int n) {
    int i;

    for (i = 0; i < n; i++) {
        v1[n - 1 - i] = v2[i] ;
    }

}

int main(void) {
    int i;
    int n;
    int v1[1000];
    int v2[1000];

    printf("请输入数组中元素的个数：\n");
    scanf("%d", &n);

    printf("请输入数组中的元素。\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &v2[i]);
    }

    intary_rcpy(v1, v2, n);

    printf("v1数组中的元素是\n");
    for (i = 0; i < n; i++)
        printf("%d", v1[i]);
    putchar('\n');

    return 0;
}