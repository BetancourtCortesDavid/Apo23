import java.util.Scanner;

public class TrabajoEnClaseDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIgite el año");
		int año=entrada.nextInt();
			
		if ((año % 400 == 0)||(año % 4 == 0) && ((año % 100 != 0))) {
			System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año no es bisiesto");
		}
	}	
}
