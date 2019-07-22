/*
创造一个函数连续发10次响铃
*/
#include <stdio.h>

/*连续响铃10次*/
void alert (int n) {
    for (n = 1; n <= 10; n++)
        puts("\a");
}
int main(void) {
    int a = 10;

    alert(a);

    return 0;
}