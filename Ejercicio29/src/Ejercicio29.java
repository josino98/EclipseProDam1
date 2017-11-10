/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dado1=(int)(Math.random()*6)+1;
		int dado2=(int)(Math.random()*6)+1;
		int lanzamientos=1;
		int suma=0;
		int contador=0;
		while(lanzamientos<=100){
			suma=dado1+dado2;
			if (suma==10){
				contador++;
			}
			lanzamientos++;
			dado1=(int)(Math.random()*6)+1;
			dado2=(int)(Math.random()*6)+1;
			
		}
		System.out.println("Ha salido "+contador+" veces 10 al lanzar los dados");
	}

}
