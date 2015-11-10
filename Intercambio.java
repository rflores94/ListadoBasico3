import utiles.*;
/**
*Define la clase Intercambio que pide dos enteros por teclado e intercambia el valor de ambas variables.
*Muestra el valor antes y después del intercambio.
*@author Roberto Carlos Flores Gomez
*@version 1.0ç
*/
public class Intercambio{
	public static void main(String[] args) {
		int x, y, z;

		x=Teclado.leerEntero("Dime el primer numero(x): ");
		y=Teclado.leerEntero("Dime el segundo numero(y): ");
		System.out.println("\n\tAntes del intercambio");
		System.out.println("x="+x);
		System.out.println("y="+y);

		z=x;
		x=y;
		y=z;

		System.out.println("\n\tDespues del intercambio");
		System.out.println("x="+x);
		System.out.println("y="+y);

	}
}