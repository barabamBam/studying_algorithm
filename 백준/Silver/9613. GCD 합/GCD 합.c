#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int GCD(int n, int m) {
    int temp;
    
    while(m != 0) {
        temp = n % m;
        n = m;
        m = temp;
    }
    
    return n;
}

int main(void) {
    int t, n;
    int num[101] = { 0, };
    long long result = 0;

    scanf("%d", &t);
    
    for (int i = 0; i < t; i++) {
        n = 0;
        memset(num, 0, sizeof(num));
        result = 0;

        scanf("%d", &n);
        for (int j = 0; j < n; j++) {
            scanf("%d", &num[j]);
        }
        for (int a = 0; a < n - 1; a++) {
            for (int b = a+1; b < n; b++) {
                result += (long long) GCD(num[a], num[b]);
            }
        }
        printf("%lld\n", result);
    }

    return 0;
}