#include <stdio.h>

int main()
{
    // 코드를 작성해주세요
    int N, result = 0;
    char num[105];
    
    scanf("%d", &N);
    scanf("%s", num);
    
    for(int i = 0; i < N; i++) {
        result += (num[i] - '0');
    }
    
    printf("%d\n", result);
    return 0;
}
