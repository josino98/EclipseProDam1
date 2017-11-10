/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Random;
public class Ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//37.Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y 100, y hacer su matriz transpuesta.

		Random rnd= new Random();
		int matriz[][]=new int [4][5];
		int fila;
		int columna;
		for(fila=0;fila<4;fila++){
			for(columna=0;columna<5;columna++){
				matriz[fila][columna]=rnd.nextInt(100)+1;
				System.out.printf(matriz[fila][columna]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(columna=0;columna<5;columna++){
			for(fila=0;fila<4;fila++){
				System.out.printf(matriz[fila][columna]+" ");
			}
			System.out.println();
			
		}
		
	}

}
