#include <stdio.h>
int main(void) {
    int a = 100;
    int *pa = &a;

    printf("%d\n", *pa);

    float fa = 34.5 , fb = 11.4;
    char ca = 'A' , cb = 'b';

    float*pf = &fa;
    char*pc = &ca;

    printf("%.1f\n", *pf);
    printf("%c\n", *pc);

    pf = &fb;
    pc = &cb;

    printf("%.f\n", *pf);
    printf("%c\n", *pc);

    *pf = fa;
    *pc = ca;

    printf("fa:%.1f  fb:%.1f\n", fa, fb);
    printf("ca:%c  cb:%c\n", ca, cb);

    return 0;
}