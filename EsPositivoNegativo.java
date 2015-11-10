/**
*Define la clase EsPositivoNegativo que pide repetidas veces un entero por teclado e
*indica si es positivo o negativo. En caso de ser cero, se sale del programa diciendo
*adiós. Crea tres versiones con las tres estructuras repetitivas y utilizando la sentencia
*break.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class EsPositivoNegativo{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x;

		do{
			System.out.println("Dime un entero, yo te digo si es positivo o negativo. Pulsa 0 para salir: ");
			x = scanner.nextInt();
			if(x>0)
				System.out.println(x+" es un numero positivo");
			else if(x<0)
				System.out.println(x+" es un numero negativo");
			else
				break;
		}while(x!=0);
		System.out.println("Adios.");
	}
}