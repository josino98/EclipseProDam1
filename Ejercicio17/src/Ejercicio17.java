/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner(System.in);
		int A=teclado.nextInt();
		int B=teclado.nextInt();
		int suma=0;
		int contador=0;
		while (B<A){
			System.out.println("pon un numero mayor o igual que el primero");
			int C=teclado.nextInt();
				B=C;
		}
		A++;
		while (A<=B){
			if (A%2==0){
				System.out.println(A);
				contador++;
				suma=A+suma;
				}
			A++;
		}
		System.out.println("Hay "+contador+" pares");
		System.out.println("La suma de los pares es "+ suma);
	}

}
