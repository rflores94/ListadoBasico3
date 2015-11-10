import utiles.*;
/**
*Define la clase DosNumeros. Lee dos enteros hasta que sean distintos. Si no lo son, se
*mostrará el mensaje "Son iguales". Una vez introducidos ambos de forma correcta se
*mostrará el menor de ellos. Utiliza el operador ?
*int menor = (entero1&lt;entero2)? entero1:entero2;
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class DosNumeros{
	public static void main(String[] args) {
		int num1, num2, menor;

		while(true){
			System.out.println("Dime dos numeros: ");
			num1=Teclado.leerEntero();
			num2=Teclado.leerEntero();
			menor=(num1<num2)? num1:num2;
			if(num1==num2)
				System.out.println("Son iguales. ");
			else{
				System.out.println(menor+" es el menor");
				break;
			}
		}
	}
}