import utiles.*;
/**
*Define la clase Menor que pide repetidas veces dos enteros por teclado e indica cuál es el menor.
*En caso de ser iguales se sale del programa diciendo adiós.
*Utiliza la sentencia break
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class Menor{
	public static void main(String[] args) {
		int x, y;
		do{
			x=Teclado.leerEntero("Dime un entero: ");
			y=Teclado.leerEntero("Dime otro entero: ");
			if(x>y)
				System.out.println("El menor es "+y);
			else if(y>x)
				System.out.println("El menor es "+x);
			else{
				System.out.println("Adios");
				break;
			}
		}while(true);
	}
}