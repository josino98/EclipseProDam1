/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//18.-Hacer un pseudoc�digo que cuente las veces que aparece una determinada letra en una frase que introduciremos por teclado

		Scanner teclado= new Scanner(System.in);
		String texto="";
		String caracter="";
		int contador=0;
		System.out.println("Introduce un texto:");
		texto=teclado.nextLine();
		System.out.println("�Qu� letra quieres contar?");
		caracter=teclado.nextLine();
		for(int i=0; i<texto.length() ;i++){
			if(texto.charAt(i)==caracter.charAt(0)){
				contador++;
			}
		}
		if (contador>0){
			System.out.println("La letra "+caracter.charAt(0)+ " se repite " + contador + " veces");
		}else{
			System.out.println("La letra no se encuentra en el texto");
		}


	}

}
