/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner teclado= new Scanner(System.in);
	int resultado;
	int contador=0;
	int numero=0;
	while (numero<=1){
		System.out.printf("Introduce un numero: ");
		numero= teclado.nextInt();	
	}
	for (int i=2; i<(int)Math.sqrt(numero)+1; i++)	{
		if(numero%i==0){
			contador++;
		}

		System.out.println();
	}
	if (contador==0){
		System.out.println("El "+numero+ " si es primo");
	}
	else{
		System.out.println("El "+numero+ " no es primo");

	}
	while (numero<0 || numero>100);
	System.out.println();
	System.out.println("Tabla de multiplicar del: "+numero);
	

	for (contador=1;contador<=10;contador++){
		resultado=contador*numero;
		System.out.println(numero+" * "+contador+" = "+resultado);
		
	}
	int factorial=1;
	System.out.println();
	System.out.printf("El factorial de "+numero+" es: ");
	if (numero<0){
		System.out.println("No tiene factorial ");
	}
	else{
		while(numero>=1){
			factorial=factorial*numero;
			numero--;
		}
		System.out.println(factorial);
	}
	
}
}


	
	
	


