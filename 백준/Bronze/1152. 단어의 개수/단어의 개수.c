#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_COUNT 1000002

int main()
{
    char* str = (char*)malloc(MAX_COUNT * sizeof(char));
    fgets(str, MAX_COUNT, stdin);
    str[strcspn(str, "\n")] = '\0';

    int cnt = 0;
    char* ptr = strtok(str, " ");
    while (ptr != NULL) {
        cnt++;
        ptr = strtok(NULL, " ");
    }


    printf("%d ", cnt);

    free(str);
 
    return 0;
}
