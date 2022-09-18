#include <stdio.h>

int main() {
    double a, b, c, a1, a2, a3, a4, a5;
    double pi = 3.14159;

    scanf("%lf %lf %lf", &a, &b, &c);

    a1 = (a * c) / 2;
    a2 = pi * (c * c);
    a3 = (1/2.0) * (a + b) * c;
    a4 = b * b;
    a5 = a * b;

    printf("TRIANGULO: %.3f\n", a1);
    printf("CIRCULO: %.3f\n", a2);
    printf("TRAPEZIO: %.3f\n", a3);
    printf("QUADRADO: %.3f\n", a4);
    printf("RETANGULO: %.3f\n", a5);


    return 0;
}
