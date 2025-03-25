#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

#define MAX_M 1000  // M의 최대값

int main()
{
    long long N, M;
    scanf("%lld %lld", &N, &M);

    long long sum = 0, cnt = 0;
    long long modSum[MAX_M] = { 0 };  // 나머지 저장 배열 (M ≤ 1000이므로 충분)

    modSum[0] = 1; // sum % M == 0 인 경우 미리 포함

    for (long long i = 0; i < N; i++) {
        long long num;
        scanf("%lld", &num);

        sum = (sum + num) % M;  // 누적합을 M으로 나눈 나머지만 관리

        if (sum < 0) sum += M; // 음수 나머지 보정

        cnt += modSum[sum]; // 같은 나머지가 나온 횟수만큼 정답 추가
        modSum[sum]++; // 현재 나머지를 기록
    }

    printf("%lld\n", cnt);
    return 0;
}
