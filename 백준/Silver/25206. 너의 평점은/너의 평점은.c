#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    char subject[55], grade[3];
    float credit, gradeNum;
    float sumCredit = 0, sumGrade = 0;

    for (int i = 0; i < 20; i++) {
        scanf("%s %f %s", subject, &credit, grade);
        if (grade[0] != 'P') {
            sumCredit += credit;

            if (grade[0] == 'A') gradeNum = 4.0;
            else if (grade[0] == 'B') gradeNum = 3.0;
            else if (grade[0] == 'C') gradeNum = 2.0;
            else if (grade[0] == 'D') gradeNum = 1.0;
            else gradeNum = 0.0;

            if (grade[1] == '+') gradeNum += 0.5;

            sumGrade += (credit * gradeNum);
        }
    }

    printf("%f ", sumGrade / sumCredit);
 
    return 0;
}
