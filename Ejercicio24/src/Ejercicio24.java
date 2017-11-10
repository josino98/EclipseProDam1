/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);

		int contador=0;
		int numero=0;
		while (numero<=1){
			System.out.println("Introduce numero mayor que uno: ");
			numero= teclado.nextInt();	
		}
		for (int i=2; i<(int)Math.sqrt(numero)+1; i++)	{
			if(numero%i==0){
				contador++;
			}


		}
		if (contador!=0){
			System.out.println("El "+numero+ " no es primo");
		}
		else{
			System.out.println("El "+numero+ " si es primo");

		}
	}
}


