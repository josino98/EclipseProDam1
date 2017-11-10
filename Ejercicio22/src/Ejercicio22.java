/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner teclado= new Scanner(System.in);
	System.out.println("Introducir frase: ");
	String frase=teclado.nextLine();
	for (int i=0; i<5; i++){
		System.out.println(frase);
		frase= "     ".concat(frase);
		
	}

	}

}
