/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class EjercicioDni {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pulsa; int opcion; int dni;
		String letra="";
		Scanner teclado= new Scanner(System.in);
		System.out.println("Pulsa 1 si eres espa�ol");
		System.out.println("Pulsa 2 si eres extranjero");
		do {
			pulsa= teclado.nextInt();
			
		} while (pulsa<1 || pulsa>2);
		opcion=pulsa;
		switch (opcion) { //Si es opcion 1, es espa�ol, si es opcion 2 es de otro pais
		case 1: //Espa�ol
			System.out.println("Introduce DNI");
			do {
				dni=teclado.nextInt();
			} while ((dni<0) || (dni>99999999));
			System.out.println("Introduzca la letra");
			letra=teclado.nextLine();
			String letra2=teclado.nextLine();
			letra=letra2;
			break;

		 case 2:
			break;
		}
		
	
		


	}

}
