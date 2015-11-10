import utiles.*;
/**
*Define la clase Mayor que pide repetidas veces dos enteros por teclado e indica cuál es el mayor. En caso de ser iguales se sale
*del programa diciendo adiós. Utiliza la sentencia break
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class Mayor{
	public static void main(String[] args) {
		int x, y;
		do{
			x=Teclado.leerEntero("Dime un entero: ");
			y=Teclado.leerEntero("Dime otro entero: ");
			if(x>y)
				System.out.println("El mayor es "+x);
			else if(y>x)
				System.out.println("El mayor es "+y);
			else{
				System.out.println("Adios");
				break;
			}
		}while(true);
	}
}