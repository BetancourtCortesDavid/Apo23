import java.util.Scanner;

public class TrabajoEnClaseDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		//definir y pedir variables
		System.out.println("DIgite el año");
		int year=entrada.nextInt();
		//detectar los años bisiestos y no bisiestos	
		if ((year % 400 == 0)||(year % 4 == 0) && ((year % 100 != 0))) {
			//imprimir por pantalla si es bisiesto
			System.out.println("El año "+ year +" es bisiesto");
		}
		else {
			//imprimir por pantalla si no es bisiesto
			System.out.println("El año "+year+" no es bisiesto");
		}
	}	
}
