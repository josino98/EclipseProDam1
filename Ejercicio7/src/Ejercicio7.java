/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7.-Introducir tantas frases como queramos y contarlas.  

		Scanner teclado= new Scanner(System.in);
		int contador=0;
		String frase=" ";
		while (frase.equals("")){
			frase=teclado.nextLine();
			contador++;	
		}
		contador--;
		System.out.println("Hay "+contador+" frases");

	}

}
