/*输入两个数之间所有整数的和
*/
#include <stdio.h>
int main(void) {
    int a, b, max, min;
    int sum = 0;/*和*/

    puts("请输入两个数:");
    scanf("%d,%d", &a, &b);

    max = a;
    if (a < b)
        max = b;
    else
        max = a;

    do {
        sum = min + sum; min++;
    } while (min <= max);
    printf("和是%d。\n", sum);
}