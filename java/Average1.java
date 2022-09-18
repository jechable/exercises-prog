import java.io.IOException;
import java.util.Scanner;

public class Average1 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double a, b, c;

        a = input.nextDouble();
        b = input.nextDouble();

        c = ((a*3.5) + (b*7.5)) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f\n", c);


    }

}
