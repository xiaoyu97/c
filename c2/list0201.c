#include <stdio.h>
int main(void){
	int x, y;
	
	printf("请输入两个整数:\n");
	printf("整数x:"); scanf("%d",&x);
	printf("整数y:"); scanf("%d",&y);

	printf("您输入的两个整数是:%d %d\n",x, y);
	printf("x + y = %d\n", x + y);
	printf("x - y = %d\n", x - y);
	printf("x * y = %d\n", x * y);
	printf("x / y = %d\n", x / y);
	printf("x %% y = %d\n", x % y);

	return 0;
}