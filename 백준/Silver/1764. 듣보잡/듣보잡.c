#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX 500000

int compare(const void*, const void*);

int main()
{
    int N, M, cnt = 0;
    scanf("%d %d", &N, &M);
    getchar();  // 버퍼 비우기 (개행 문자 제거)

    // 동적 메모리 할당
    char** neverHeard = (char**)malloc(N * sizeof(char*));
    for (int i = 0; i < N; i++) {
        neverHeard[i] = (char*)malloc(22 * sizeof(char));
        fgets(neverHeard[i], 22, stdin);
        neverHeard[i][strcspn(neverHeard[i], "\n")] = '\0';  // 개행 문자 제거
    }

    qsort(neverHeard, N, sizeof(char*), compare);


    char** both = (char**)malloc((N < M ? N : M) * sizeof(char*));

    char neverWatch[22];

    for (int i = 0; i < M; i++) {
        fgets(neverWatch, 22, stdin);
        neverWatch[strcspn(neverWatch, "\n")] = '\0';  // 개행 문자 제거
        char* key = neverWatch;

        char** found = (char**)bsearch(&key, neverHeard, N, sizeof(char*), compare);
        if (found) {
            both[cnt] = (char*)malloc(22 * sizeof(char));
            strncpy(both[cnt], neverWatch, 20);
            both[cnt][21] = '\0';
            cnt++;
        }
    }

    qsort(both, cnt, sizeof(char*), compare);


    printf("%d\n", cnt);
    for (int i = 0; i < cnt; i++) {
        printf("%s\n", both[i]);
        free(both[i]);
    }

    for (int i = 0; i < N; i++) free(neverHeard[i]);
    free(neverHeard);
    free(both);

    return 0;
}

int compare(const void* a, const void* b) {
    return strcmp(*(char**)a, *(char**)b);
}
