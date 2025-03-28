#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>


int countOnes(int n) {
    int count = 0;
    while (n > 0) {
        if (n % 2 == 1) count++;  // 현재 비트가 1이면 카운트 증가
        n /= 2;  // 오른쪽으로 한 비트 이동 (2로 나누기)
    }
    return count;
}

int minBottlesToBuy(int N, int K) {
    int count = 0;
    while (countOnes(N) > K) {  // 1의 개수가 K보다 많다면
        N++;  // 물병 하나 구매
        count++;  // 구매한 개수 증가

    }
    return count;
}

int main() {
    int N, K;
    scanf("%d %d", &N, &K);  // 입력 받기
    printf("%d\n", minBottlesToBuy(N, K));  // 최소 구매 개수 출력
    return 0;
}
