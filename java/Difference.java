import java.io.IOException;
import java.util.Scanner;

public class Difference {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int a, b, c, d, e;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        e = (a * b - c * d);

        System.out.printf("DIFERENCA = %d\n", e);
    }

}
