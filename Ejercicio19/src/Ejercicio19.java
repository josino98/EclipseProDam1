/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub+�
	Scanner teclado =new Scanner(System.in);
	int horas=-1;	int minutos=-1; 	int segundos=-1;
	
	while(horas<0 || horas>23){
		System.out.println("introduce horas :");
		horas=teclado.nextInt();
		
		if (horas<0 || horas>23){
			System.out.println("Error, hora no valida");
		}
	}
	while(minutos<0 || minutos>59){
		System.out.println("introduce minutos :");
		minutos=teclado.nextInt();
		
		if (minutos<0 || minutos>59){
			System.out.println("Error, minutos no valido");
		}
	}
	while(segundos<0 || segundos>59){
		System.out.println("introduce segundos :");
		segundos=teclado.nextInt();
		
		if (segundos<0 || segundos>59){
			System.out.println("Error, segundos no valido");
		}
	}
	while (horas<25){
		if(segundos==60){
			segundos=0;
			minutos++;
					
		}
		if (minutos==60){
			minutos=0;
			horas++;
		}
		if(horas==24){
			horas=0;
		}
		System.out.println(horas+":"+minutos+":"+segundos);
		segundos++;
		Thread.sleep(1000);
	}
	
	}

}

