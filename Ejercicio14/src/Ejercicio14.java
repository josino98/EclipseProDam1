/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int numero= teclado.nextInt();
		int contador=1;
		int mayor=numero;
		int menor=numero;
		while (contador<5){
			numero= teclado.nextInt();
			if (numero>mayor){
				mayor=numero;
			}
			if (numero<menor){
				menor=numero;
			}
			contador++;
		}
		System.out.println("El mayor es " + mayor);
		System.out.println("El menor es " + menor);
	}
}
