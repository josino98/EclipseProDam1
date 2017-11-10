

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase=teclado.nextLine();
		System.out.println();
		for (int i=0; i<(180-frase.length())/2; i++){ //180 es el ancho de la consola mas o menos
			frase =" ".concat(frase);
		}
		System.out.println(frase);
	}

}
