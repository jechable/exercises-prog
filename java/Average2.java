import java.io.IOException;
import java.util.Scanner;

public class Average2 {

    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    double a, b, c, d;

    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();

    c = (a*2 + b*3 + c*5)/(2 + 3 + 5);

    System.out.printf("MEDIA = %.1f\n", c);

    }

}
