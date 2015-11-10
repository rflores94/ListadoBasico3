import utiles.*;
/**
*Define la clase AccesoDenegado que simule el acceso a un sitio en función de dos valores introducidos por el usuario:
*edad del usuario y autorización paterna.
*Sólo aparecerá el mensaje "Bienvenido" si el usuario es mayor de edad o si siendo menor de edad tiene la autorización paterna.
*En cualquier otro caso, que muestre "Acceso denegado".
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class AccesoDenegado{
	public static void main(String[] args) {
		int edad=Teclado.leerEntero("Dime tu edad: ");
		if(edad<18){
			char autorizacion=Teclado.leerCaracter("Tienes autorizacion paterna? (s/n)");
			if(autorizacion=='s'){
				System.out.println("Bienvenido");
				return;
			}
			else{
				System.out.println("Acceso Denegado");
				return;
			}
		}
		System.out.println("Bienvenido");
	}
}