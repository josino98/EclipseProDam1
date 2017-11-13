/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class String6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Leer una frase por teclado (máximo 80) y a continuación escribir cuantas vocales, consonantes y caracteres numéricos posee.
				Scanner teclado= new Scanner(System.in);
			 
				String frase;
				String vocales="AEIOU";
				String consonantes="BCDFGHJKLMNÑPQRSTVWXYZ";
				String numeros="0123456789";
				
				char caracter;
				int contaVocales=0;
				int contaConsonantes=0;
				int contaNumeros=0; 
				int i;
				
				do{
					System.out.println("Introduce una frase con un maximo de 80 caracteres: ");
					frase=teclado.nextLine();
				}while(frase.length()>80);
				frase = teclado.nextLine();
			
				for(i=0; i<=frase.length()-1;i++){
					caracter=frase.charAt(i);
					if(vocales.indexOf(caracter) !=-1){
						contaVocales++;
					}else if(consonantes.indexOf(caracter) !=-1){
						contaConsonantes++;
					}else if(numeros.indexOf(caracter) !=-1){
						contaNumeros++;
					}
				}
				
				System.out.println("En la frase "+ frase + " hay " + contaVocales + " vocal(es) " +
						contaConsonantes + " consonante(s) y " + contaNumeros + " numero(s).");
				
			
			}
		
		}


