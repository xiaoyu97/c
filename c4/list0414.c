/*
按照升序显示出小于输入值的所有正偶数。
*/
#include <stdio.h>
int main(void) {
    int no;
    int i = 1;

    printf("请输入一个整数：");
    scanf("%d", &no);
    while (i < no) {
        if (i % 2 == 0) {

            printf("%d", i );
        }
        i++;
    }

    return 0;

}