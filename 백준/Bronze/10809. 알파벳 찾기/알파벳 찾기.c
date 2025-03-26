#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    char word[105];
    scanf("%s", word);

    int alphabet[28];
    memset(alphabet, -1, sizeof(alphabet));

    for (int i = 0; i < strlen(word); i++) {
        if (alphabet[word[i] - 'a'] == -1) alphabet[word[i] - 'a'] = i;
    }

    for (int i = 0; i < 26; i++) {
        printf("%d ", alphabet[i]);
    }

    return 0;
}

