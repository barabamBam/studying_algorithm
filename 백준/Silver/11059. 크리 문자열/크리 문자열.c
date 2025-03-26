#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main()
{
    char str[1005];
    scanf("%s", &str);
    int length = strlen(str);
    int ans = 0;

    for (int i = 1; i < length; i++) {
        int left = i - 1;
        int right = i;
        int sumL = 0;
        int sumR = 0;

        while (left > -1 && right < length) {
            sumL += str[left] - '0';
            sumR += str[right] - '0';
            if (sumL == sumR) {
                ans = ans > (right - left + 1) ? ans : (right - left + 1);
            }
            left--;
            right++;
        }
    }
    
    printf("%d\n", ans);

    return 0;

}
