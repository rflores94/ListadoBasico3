/**
*Define la clase BuscandoElCero. Utilizando el método Math.random() que devuelve
*un número aleatorio entre 0 y 1 [0, 1) comprueba mediante un bucle infinito si el resultado en algún momento da el valor 0.
*Utiliza la sentencia break para salir del bucle.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class BuscandoElCero{
	public static void main(String[] args) {
		double x,i=0;
		do{
			x=Math.random()*10/10;
			System.out.println(x);
			i++;
			if (x==0.0000000000000000) {
				System.out.println("Se ha encontrado el 0");
				break;
			}
		}while(i<1000);
	}
}