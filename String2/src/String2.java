/**
 * 
 */

/**
 * @author usuario
 *
 */import java.util.Scanner;
public class String2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contaMay=0;
		int contaMin=0;
		int linea;
		String frase;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Frase de 80 caracteres como máximo");
			frase = teclado.nextLine();
		}while(frase.length() > 80);
			

		for(int i=0; i < frase.length(); i++){
			if(frase.charAt(i) >= 97 && frase.charAt(i) <= 122){
				contaMin++;
			}if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
				contaMay++;
					}
				}
				System.out.println(frase + " tiene " + contaMay + " mayuscula(s) y " + contaMin + " minuscula(s)");
			}
		}

