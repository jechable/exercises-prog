#include <stdio.h>

int main() {
    int x;
    double y, av;

    scanf("%d\n", &x);
    scanf("%lf", &y);

    av = x / y;

    printf("%.3f km/l\n", av);

    return 0;
}
