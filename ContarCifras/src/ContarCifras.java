import java.util.Scanner;

public class ContarCifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir y pedir variables
		Scanner entrada = new Scanner(System.in);
		int c = 0;
		System.out.println("DIgite el número");
		int numero=entrada.nextInt();
		int numOriginal=numero;
		
		//Si el número tiene una sola cifra hacer que  contador (cifras) = 1
		if(numero/10==0) {
			c=1;
		}
		//sino hacer el proceso para contar las cifras
		else {
			while(numero!=0) {
			numero=numero/10;
			c++;
			}
		}
		//imprimir la cantidad de cifras
System.out.println("El número "+numOriginal+" Tiene "+c+" cifras");
		
		


	
	}
}
