#include <stdio.h>
#include <math.h>

int main() {
    int c;

    scanf("%d", &c);

    int nm[c][2];

    for (int i = 0; i < c; i++) {
        scanf("%d %d", &nm[i][0], &nm[i][1]);
    }

    for (int j = 0; j < c; j++) {
        long long int exp = pow(nm[j][0], nm[j][1]);
        printf("%d\n", exp);
        //printf("%d %d\n", nm[j][1], nm[j][2]);
    }

    return 0;
}
