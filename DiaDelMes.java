import utiles.*;
/**
*Define la clase DiaDelMes que pide dos enteros, que representarán un mes y un año. Se visualizará el número de días del mes,
*teniendo en cuenta que:
*a. 31 días tienen Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre
*b. 30 días tienen Febrero, Abril, Junio, Septiembre, Noviembre
*c. Febrero tiene 29 días si el año es bisiesto. En cualquier otro caso, tiene 28
*d. Un año es bisiesto si es divisible entre 4, a menos que sea divisible entre 100. Sin embargo, si un año es divisible entre 100
*y además es divisible entre 400, también resulta bisiesto.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class DiaDelMes{
	public static void main(String[] args) {
			int mes, anio;
			mes=Teclado.leerEntero("Dime el numero del mes: ");
			anio=Teclado.leerEntero("Dime el anio: ");
			 switch(mes){
			 	case 2:
			 		if ((anio%4==0 && anio%100!=0) || (anio%100==0 && anio%400==0))
			 			System.out.println("Tiene 29 dias");
			 		else
			 			System.out.println("Tiene 28 dias");
			 		break;
			 	case 4:
			 	case 6:
			 	case 9:
			 	case 11:
			 		System.out.println("Tiene 30 dias");
			 		break;
			 	default:
			 		System.out.println("Tiene 31 dias");
			 }
		}	
}