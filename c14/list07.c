//两种方法遍历字符串
#include <stdio.h>
int main(void) {
    // int len=0;
//    char a[5] = {"hello"};
//    for (int i=0;i<5;i++){
//    	printf("%c",a[i]);
//    	len++;

//    }
//    printf("长度是%d。\n",len);


    int len = 0;
    char a[5]={"hello"};
    char* p;
    p=&a[0];
    while (*p){
    	printf("%c",*p);
    	p++;
    	len++;
    }
    printf("长度是%d。\n",len-1);
    return 0;
}
