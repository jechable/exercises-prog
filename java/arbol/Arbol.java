import java.util.Scanner;

public class Arbol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese peso de moneda 1");
        int c1 = input.nextInt();

        System.out.println("Ingrese peso de moneda 2");
        int c2 = input.nextInt();

        System.out.println("Ingrese peso de moneda 3");
        int c3 = input.nextInt();

        System.out.println("Ingrese peso de moneda 4");
        int c4 = input.nextInt();

        System.out.println("Ingrese peso de moneda 5");
        int c5 = input.nextInt();

        System.out.println("Ingrese peso de moneda 6");
        int c6 = input.nextInt();

        System.out.println("Ingrese peso de moneda 7");
        int c7 = input.nextInt();

        System.out.println("Ingrese peso de moneda 8");
        int c8 = input.nextInt();

        if (c1 > c2) {
            if (c1 > c8) {
                System.out.println("1, pesada");
            } else {
                System.out.println("2, liviana");
            }
        } else if (c2 > c1) {
            if (c8 > c1) {
                System.out.println("1, liviana");
            } else {
                System.out.println("2, pesada");
            }
        } else {
            if (c3 > c4) {
                if (c3 > c8) {
                    System.out.println("3, pesada");
                } else {
                    System.out.println("4, liviana");
                }
            } else if (c4 > c3) {
                if (c8 > c3) {
                    System.out.println("3, liviana");
                } else {
                    System.out.println("4, pesada");
                }
            } else {
                if (c5 > c6) {
                    if (c5 > c8) {
                        System.out.println("5, pesada");
                    } else {
                        System.out.println("6, liviana");
                    }
                } else if (c6 > c5) {
                    if (c8 > c5) {
                        System.out.println("5, liviana");
                    } else {
                        System.out.println("6, pesada");
                    }
                } else {
                    if (c7 > c8) {
                        if (c7 > c1) {
                            System.out.println("7, pesada");
                        } else {
                            System.out.println("8, liviana");
                        }
                    } else if (c8 > c7) {
                        if (c1 > c7) {
                            System.out.println("7, liviana");
                        } else {
                            System.out.println("8, pesada");
                        }
                    }
                }
            }
        }

    }

}
