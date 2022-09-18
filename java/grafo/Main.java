public class Main {
	public static void main(String[] args) {

		Grafo g = new Grafo(4, 5);


		g.agregarArista(1, 1, 2);
		g.agregarArista(2, 1, 4);
		g.agregarArista(3, 3, 4);
		g.agregarArista(4, 2, 4);
		g.agregarArista(5, 2, 3);



		g.imprimirAdyacencia();

		System.out.println();

		g.generarValencias();
		g.imprimirValencias();

		System.out.println();

		g.imprimirIncidencia();
	}
}
