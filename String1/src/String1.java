

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class String1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Frase de hasta 80 caracteres:");
			frase = teclado.nextLine();
		}while(frase.length() > 80);

		for(int i=0; i<frase.length(); i++){
			System.out.println(frase.substring(0,i+1));	
		}


	}

}


