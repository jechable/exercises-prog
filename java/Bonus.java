import java.io.IOException;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n;
        Double s, b, t;

        n = input.nextLine();
        s = input.nextDouble();
        b = input.nextDouble();
        t = s + (b * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", t);

    }

}
