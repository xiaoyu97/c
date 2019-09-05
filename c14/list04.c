//求这一天是一年中的第几天
#include <stdio.h>
int A (int y, int m, int d) {
    int sum = 0;
    switch (m - 1) {
    case 11: sum += 30;
    case 10: sum += 31;
    case 9: sum += 30;
    case 8: sum += 31;
    case 7: sum += 31;
    case 6: sum += 30;
    case 5: sum += 31;
    case 4: sum += 30;
    case 3: sum += 31;
    case 2: {
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
            sum += 29;
        else
            sum += 28;
    }
    case 1: sum += 31; break;
    }
    sum += d;
    return sum;

}


int main(void) {
    int y, m, d;
    puts("请输入年月日");
    printf("年：月：日：");
    scanf("%d,%d,%d", &y, &m, &d);
    //A(y,m,d);
    printf("您输入的日期是这一年的第%d天。\n", A(y, m, d));
}