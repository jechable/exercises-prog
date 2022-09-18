import java.util.Arrays;

public class Array {
    //int[][] arreglo;
    int[][] arreglo = {{1}, {2}, {3}};

    void crearArreglo() {
        //arreglo = new int[2][2];

    }

    void imprimirArreglo() {
        Arrays.deepToString(arreglo);
    }

    public static void main(String[] args) {
        int[][] array = new int[3][2];
        array[0][0] = 0;
        array[0][1] = 0;

        array[1][0] = 0;
        array[1][1] = 0;

        array[2][0] = 0;
        array[2][1] = 0;

        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i][0]);
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(array[i][j]+" ");
            }
            System.out.println();
        }

        /*
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(array[i][j]+" ");
            }
            System.out.println();
        }
        */
        System.out.println();
        System.out.println(array.length);
        System.out.println(array[0].length);
    }
}
