/* 4) Leer una cadena de hasta 80 caracteres y pasarla en funci�n de una variable de opci�n a
may�sculas � a min�sculas e imprimir la cadena resultante*/
import java.util.*;
public class T04Ej04v1 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String frase;
		final int MAX_LONGITUD = 80;
		int opcion;

		do{
			System.out.println("Frase (max. 80 caracteres): ");
			frase = teclado.nextLine();
		}while(frase.length() > MAX_LONGITUD);
		do{
			System.out.println("Selecciona 1 para convertir a MAY�sculas");
			System.out.println("Selecciona 2 para convertir a MIN�sculas");
			opcion = teclado.nextInt();			
		}while( opcion != 1 && opcion !=2 );
		switch (opcion){// no se modifica el String frase
		case 1: System.out.println(frase + " en may�culas es " + frase.toUpperCase());
			break;
		case 2: System.out.println(frase + " en min�sculas es " + frase.toLowerCase());
		}//switch
	}//main
	
}//class
