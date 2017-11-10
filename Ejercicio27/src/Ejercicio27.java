/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int num;
		int resultado;
		int contador;
		do{
			System.out.println("Introduce un numero");
			num=teclado.nextInt();		
		} while (num<0 || num>10);
		System.out.println("Tabla de multiplicar del "+num);

		for (contador=1;contador<=10;contador++){
			resultado=contador*num;
			System.out.println(num+" * "+contador+" = "+resultado);
		}


	}

}


