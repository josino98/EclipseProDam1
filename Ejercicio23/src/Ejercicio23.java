import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		Scanner teclado;
		teclado=new Scanner(System.in);
	    int columnas=teclado.nextInt();
		while (contador<=100){
			if(contador%columnas==0){
				System.out.println();
			}
			System.out.printf("%3d ", contador);
			contador++;
										
		}
		
	}

}
