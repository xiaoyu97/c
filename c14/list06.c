//九九乘法表
#include <stdio.h>
int main(void){
	for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++){
			printf("%2d *%2d=%2d ",j,i,i*j);
		}
		printf("\n");
	}
	return 0;
}