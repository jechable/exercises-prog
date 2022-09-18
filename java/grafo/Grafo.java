import java.util.Arrays;

public class Grafo {
    int[][] adyacencia, incidencia;
    int[] valencias;
    int cantNodos, cantAristas;

    // Constructores de grafo
    Grafo(int cantNodos, int cantAristas) {
        this.cantNodos = cantNodos;
        this.cantAristas = cantAristas;

        adyacencia = new int[cantNodos][cantNodos];
        incidencia = new int[cantNodos][cantAristas];
    }

    Grafo() {
    }

    // Setters y getters
    void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }

    void setCantAristas(int cantAristas) {
        this.cantAristas = cantAristas;
    }

    int getCantNodos() {
        return cantNodos;
    }

    void agregarArista(int a, int i, int j) {
        adyacencia[i-1][j-1] = 1;
        adyacencia[j-1][i-1] = 1;

        incidencia[i-1][a-1] = 1;
        incidencia[j-1][a-1] = 1;

    }

    void generarValencias() {
        System.out.println("Valencias");
        valencias = new int[cantNodos];
        int caminos = 0;
        for (int i = 0; i < incidencia.length; i++) {
            for (int j = 0; j < incidencia[i].length; j++) {
                if (incidencia[i][j] == 1) {
                   caminos++;
                }
            }
            valencias[i] = caminos;
            caminos = 0;
        }
    }

    void imprimirValencias() {
        for (int i = 0; i < valencias.length; i++) {
            System.out.println(valencias[i]);
        }
    }

    void imprimirAdyacencia() {
        System.out.println("Matriz de adyacencia\n");
        for (int i = 0; i < cantNodos; i++) {
            for (int j = 0; j < cantNodos; j++) {
                System.out.printf(adyacencia[i][j]+" ");
            }
            System.out.println();
        }
    }

    void imprimirIncidencia() {
        System.out.println("Matriz de incidencia");
        for (int i = 0; i < incidencia.length; i++) {
            for (int j = 0; j < incidencia[i].length; j++) {
                System.out.printf(incidencia[i][j]+" ");
            }
            System.out.println();
        }
    }


}
