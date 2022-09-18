#include <stdio.h>
#include <stdlib.h>

int main() {

    int a, b, c, m1, m2;

    scanf("%d %d %d", &a, &b, &c);

    m1 = (a + b + abs(a - b))/2;

    if (m1 == a) {
        if (a > c) {
            m2 = a;
        } else {
            m2 = c;
        }
    } else if (m1 == b) {
        if (b > c) {
            m2 = b;
        } else {
            m2 = c;
        }
    }

    printf("%d eh o maior\n", m2);

    return 0;
}
