import utiles.*;
/**
*Define la clase CuentaCaracteres. Lee caracteres desde el teclado hasta que el usuario introduce un asterisco.
*En ese caso, se mostrará un recuento de:
*a. Los dígitos introducidos [0-9]
*b. Las minúsculas introducidos [a-z]
*c. Las mayúsculas introducidos [A-Z]
*d. El resto de caracteres (Sin contar el asterisco)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class CuentaCaracteres{
	public static void main(String[] args) {
		int digitos=0, minusculas=0, mayusculas=0, resto=0;
		char caracter;

		do{
			caracter=Teclado.leerCaracter("Dime un caracter. Introduce un '*' para salir");
			if(caracter>='0' && caracter<='9')
				digitos++;
			else if(caracter>='a' && caracter<='z')
				minusculas++;
			else if(caracter>='A' && caracter<='Z')
				mayusculas++;
			else if(caracter!='*')
				resto++;
		}while(caracter!='*');
		System.out.println("Has introducido: \n"
			+digitos+" digitos.\n"
			+minusculas+" minusculas.\n"
			+mayusculas+" mayusculas.\n"
			+resto+" otros caracteres.");
	}
}