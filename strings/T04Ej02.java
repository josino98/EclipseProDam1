//2. Dada una frase de no m�s de 80 caracteres hacer un programa que busque cu�ntas may�sculas y min�sculas tiene y lo imprima
import java.util.Scanner;
public class T04Ej02 {
	public static void main(String[] args){		
		int contaMay;
		int contaMin;
		int linea;
		String frase;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Frase de 80 caracteres como m�ximo");
			frase = teclado.nextLine();
		}while(frase.length() > 80);
		contaMay=0;
		contaMin=0;
		for(int i=0; i < frase.length(); i++){
			if(frase.charAt(i) >= 97 && frase.charAt(i) <= 122){
				contaMin++;
			}else if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
				contaMay++;
			}
		}
		System.out.println(frase + " tiene " + contaMay + " mayuscula(s) y " + contaMin + " minuscula(s)");
	}
}
