/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class String7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer una frase por teclado y escribir a continuaci�n cuantas may�sculas, min�sculas y n�meros contiene.

		Scanner teclado= new Scanner(System.in);
		String frase;
		char caracter;
		String numeros="0123456789";
		String mayusculas="ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
		String minusculas="abcdefghijklmn�opqrstuvwxyz";
		int contaMinusculas=0;
		int contaMayusculas=0;
		int contaNumeros=0; 
		System.out.println("Introduce una frase: ");
		frase=teclado.nextLine();
		int i;
		for(i=0; i<=frase.length()-1;i++){
			caracter=frase.charAt(i);
			if(mayusculas.indexOf(caracter) !=-1){
				contaMayusculas++;
			}else if(minusculas.indexOf(caracter) !=-1){
				contaMinusculas++;
			}else if(numeros.indexOf(caracter) !=-1){
				contaNumeros++;	 


			}
		}
		System.out.println("En la frase "+ frase + " hay " + contaMayusculas + " mayuscula(s) " +
				contaMinusculas + " minuscula(s) y " + contaNumeros + " numero(s).");	
	}
}