import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner teclado=new Scanner(System.in);
	String nombres[];
	String comodin;
	nombres=new String[5];//20 nombres introducimos
	for (int i=0; i<nombres.length;i++){
		System.out.println("Introduce un nombre:");
		nombres[i]=teclado.nextLine();
	}
    System.out.println(nombres);
	}

}
