/**
*Define la clase SeriesCrecientesDe25. Utilizando las tres
*estructuras de repetición (while, do while y for) genera la serie del 0 al 1000 con un incremento de 25 (ambos incluídos)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class SeriesCrecientesDe25{
	public static void main(String[] args) {
		System.out.println("\tCon For: ");
		for (int i=0; i<=100; i+=25) {
			System.out.print(i+"\t");
		}

		System.out.println("\n\tCon While: ");
		int x=0;
		while(x<=100){
			System.out.print(x+"\t");
			x+=25;
		}

		System.out.println("\n\tCon Do... While: ");
		int j=0;
		do{
			System.out.print(j+"\t");
			j+=25;
		}while(j<=100);
	}
}