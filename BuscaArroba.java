import utiles.*;
/**
*Define la clase BuscaArroba. Lee caracteres desde teclado hasta que introduzca la arroba. Una vez introducida, se mostrará el
*número de caracteres introducidos entre la B mayúscula y la T mayúscula.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class BuscaArroba{
	public static void main(String[] args) {
		char x;
		int i=0;

		do{
			x=Teclado.leerCaracter("Dime un caracter: ");
			if(x>='B' && x<='T')
				i++;
		}while(x!='@');
		System.out.println("Has introducido "+i+" caracteres entre 'B' y 'T'");
	}
}