import java.util.Scanner;

public class ContarCifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int c = 0;
		System.out.println("DIgite el número");
		int numero=entrada.nextInt();
		int real=numero;
		if(numero/10==0) {
			c=1;
		}else {
			while(numero!=0) {
			numero=numero/10;
			c++;
			}
		}
System.out.println("Tiene "+c+" cifras");
		
		


	
	}
}
