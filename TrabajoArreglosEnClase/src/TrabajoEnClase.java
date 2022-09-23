import java.util.Scanner;


public class TrabajoEnClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definir los arreglos y variables
		String[] nombre, apellido;
		nombre = new String [10];
		apellido = new String [10];
		double[] nota;
		nota = new double [10];
		//inicializar las variables necesarias
		double mayorNota = 0;
		int k=0;
		Scanner leer = new Scanner(System.in);
		
		//Pedir datos por pantalla y almacenarlos mientras recorro el arreglo
		for (int i = 0; i<=9; i++) 
		{
			//un contador extra que me ayudará más adelante (además de facilitar los prints)
			k=i+1;
			//pedir el nombre
			System.out.println("Ingrese el nombre del estudiante #"+k+": ");
			nombre[i]=leer.next();
			//pedir el apellido
			System.out.println("Ingrese el apellido del estudiante #"+k+": ");
			apellido[i]=leer.next();
			//pedir la nota
			System.out.println("Digite la nota del estudiante #"+k+": ");
			nota[i]=leer.nextDouble();
			
		}
		
		//Operación para saber la nota más alta y el indice del estudiante con esta, mientras recorro el arreglo
		for (int i = 1; i<=9; i++) {
			if (mayorNota < nota[i] || mayorNota < nota[i-1]) {
			mayorNota = (nota[i]<nota[i-1]?nota[i-1]:nota[i]);
			k=(nota[i]<nota[i-1]?i-1:i);
			}
			}
		//un espacio entre líneas para que se vea más bonito
		System.out.println("\n");
		/* Salidas: 
		imprimir por pantalla la lista de los estudiantes mientras recorro el arreglo*/
		for (int i = 0; i<=9; i++) 
		{
			System.out.println("Estudiante #"+(i+1)+": "+nombre[i]+" "+apellido[i]+"   Nota: "+nota[i]);
				//Una "línea" de "*" para que se vea más bonito
			System.out.println("***************************************************");
		}
		//imprimir por pantalla el estudiante con nota mayor usando el contador k para almacenar el indice de la mayor nota
		System.out.println("El alumno con la nota más alta es: "+nombre[k]+" "+apellido[k]);
		System.out.println("Con una nota de: "+mayorNota);
	}

}
