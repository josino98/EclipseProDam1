/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0; 
		int sumapares=0; 
		int sumaimpares=0;
		while (contador<=100){
			if (contador%2==0) {
				System.out.println(contador);
				sumapares=contador+sumapares;
			}
			else{
				System.out.println(contador);
				sumaimpares=contador+sumaimpares;
			}
			contador++;
		}
		System.out.println("La suma de los pares es " + sumapares);
		System.out.println("La suma de los impares es " + sumaimpares);
	}
}

