#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int searchStr(const char*, const char*);

int main()
{
    char str[2505], findStr[55];
    
    fgets(str, 2505, stdin);
    str[strcspn(str, "\n")] = '\0';

    fgets(findStr, 55, stdin);
    findStr[strcspn(findStr, "\n")] = '\0';

    int result = searchStr(str, findStr);

    printf("%d\n", result);

    return 0;

}

int searchStr(const char* str, const char* findStr) {
    int cnt = 0, strLen = strlen(findStr);
    
    char* restStr = strstr(str, findStr);

    while (restStr != NULL) {
        cnt++;
        restStr = strstr((restStr + strcspn(restStr, findStr) + strLen), findStr);
    }

    return cnt;
}