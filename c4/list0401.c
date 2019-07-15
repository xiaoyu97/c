 /*
求1到100的和
*/
#include <stdio.h>
int main(void) {
    int i = 1;
    int sum = 0;

    /*do{
    	sum=sum+i;
    	i++;
    }
    while(i<=100);
    printf("它们的和是%d\n",sum);    */

    /*while(i<=100);
    {
    	sum=sum+i;
    	i++;}
    printf("它们的和是%d\n",sum);   */

    for (i = 1; i <= 100; i++)
       { sum = sum + i;}
    printf("它们的和是%d\n", sum);

    return 0;
}


