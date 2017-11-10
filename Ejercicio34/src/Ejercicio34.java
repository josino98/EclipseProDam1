/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]calificaciones=new 
		int[5];//5 calificaiones vamos a meter
		float media=0f;//float para q haga decimales 
		//para que entre en un rango de numeros:
		String[]asignaturas={"mates","lengua","ingles","ciencias","programacion"};
		Scanner teclado=new Scanner(System.in);
		for(int contador=0; contador<calificaciones.length; contador++){
			System.out.println("Escribe la nota de: "+asignaturas[contador]);
			calificaciones[contador]=teclado.nextInt();
			media=media+calificaciones[contador];
		}
		media=media/5;
		System.out.println("la nota media es:"+media);
	}

}
