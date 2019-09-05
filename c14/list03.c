#include <stdio.h>
int main(void){
	int a,b;
	puts("请输入两个整数");
	printf("整数1：");scanf("%d",&a);
	printf("整数2:");scanf("%d",&b);
	printf("%d是%d的百分之%0.f\n",a,b,(double)((a*100)/b));
	return 0;
}