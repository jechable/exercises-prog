import java.util.Scanner;
public class Matriz{
int []vector;
	int []vector2;

int matriz[][], numeroFilas=4, numeroColumnas=4;
	Scanner entrada =new Scanner (System.in);
	
	public Matriz(int fila, int columna){
		matriz = new int[fila][columna];
	}
	public int saberTamafila(){
        return matriz.length;
		
		}
		public int saberTamacolumna(){
		return matriz[0].length;
			}
		
	
	public void crearMatriz(){
		
	System.out.println("Digite un valor: ");
	for (int i=0; i<this.saberTamafila();i++)
		{
		for (int j=0; j<this.saberTamacolumna();j++)
			{
			System.out.print("Posicion: ["+i+"]["+j+"]:");
			matriz[i][j]=entrada.nextInt();
				
			}
	    
		}
		
		vector=new int[saberTamafila()];
		vector2=new int[saberTamcolumna()];
	}
	public void imprimirVector(){
	for(int i=0; i<vector.length; i++){
		System.out.println(vector[i]);
		}
		}

	public void mostrarMatriz(){
		System.out.println("\nLa matriz es: ");
		for (int i=0; i<numeroFilas;i++)
			{
			int camA=0;
		    for (int j=0; j<numeroColumnas;j++)
			    {
			System.out.printf("%d ",matriz[i][j]);
			    camA +=matriz[i][j];
			}
		  
		    System.out.printf("= Caminos activos en la fila "+i+ " son %d\n",camA);
			}
	   
	}
	public void recorrerMatriz(int[][] x,int tiporecorrido)
	{
		    int rouw=x.length;
		    int f = x[0].length;
		    
		    if (tiporecorrido==1)
			{
			    for(int fila=0; fila < x.length; fila++)
				{
				    int contador=0;
					for(int columna=0; columna<x[0].length;columna++)
						{
						System.out.println("Recorrido por fila:");
						System.out.print(x[fila][columna]);
							if (x[fila][columna]==1){
								contador++;
								}//
						}
					System.out.println("");
					vector[fila]=contador;	
				}
			}	
		    else
			{
			 
			     for(int columna=0; columna<x[0].length;columna++)
				     {
				      for(int fila=0; fila < x.length; fila++)
					      {
						System.out.println("Recorrido por columna:");
						System.out.print(x[fila][columna]);
				    
						} 
					}	
		    
			}
		    
		    
	}
	public int[][] devolverMatriz(){
	    return matriz;
		    
	}
	public void imprimirVector2(){
	
		}
	
	    
		    public static void main(String arg[]){
			    Matriz m =new Matriz(2,3);
			    m.crearMatriz();
			    m.recorrerMatriz(m.devolverMatriz(),1);
			    m.imprimirVector();
			    
			    
		}
}
		    
