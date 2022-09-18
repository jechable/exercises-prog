import java.io.IOException;
import java.util.Scanner;

public class Circle {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double r, a, pi = 3.14159;

        r = input.nextDouble();
        a = pi*(r*r);

        System.out.printf("A=%.4f\n", a);


    }

}
