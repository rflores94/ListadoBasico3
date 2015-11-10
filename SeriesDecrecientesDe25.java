/**
*Define la clase SeriesDecrecientesDe25. Utilizando las tres estructuras de
*repetición (while, do while y for) genera las series del 1000 al 0 con un decremento de 25 (ambos incluídos
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class SeriesDecrecientesDe25{
	public static void main(String[] args) {
		System.out.println("\tCon For: ");
		for (int i=1000; i>=0; i-=25) {
			System.out.print(i+"\t");
		}

		System.out.println("\n\tCon While: ");
		int x=1000;
		while(x>=0){
			System.out.print(x+"\t");
			x-=25;
		}

		System.out.println("\n\tCon Do... While: ");
		int j=1000;
		do{
			System.out.print(j+"\t");
			j-=25;
		}while(j>=0);
	}
}