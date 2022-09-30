import java.util.Scanner;

public class TrabajoEnClaseDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIgite el año");
		int year=entrada.nextInt();
			
		if ((year % 400 == 0)||(year % 4 == 0) && ((year % 100 != 0))) {
			System.out.println("El año "+ year +" es bisiesto");
		}
		else {
			System.out.println("El año "+year+" no es bisiesto");
		}
	}	
}
