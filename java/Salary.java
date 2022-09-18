import java.io.IOException;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        double c, d;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextFloat();

        d = b*c;

        System.out.printf("NUMBER = %d\n", a);
        System.out.printf("SALARY = U$ %.2f\n", d);
    }

}
