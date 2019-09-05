//冒泡排序,从小到大
#include <stdio.h>
int main(void){
	int a[6]={6,5,4,3,2,1};
	for(int i=0;i<6-1;i++){
		for(int j=0;j<6-1-i;j++){
			if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}

		}
	}
	for(int i=0;i<6;i++){
		printf("%d  ",a[i]);
	}
	printf("\n");
	return 0;
}
