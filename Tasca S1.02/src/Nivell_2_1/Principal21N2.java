package Nivell_2_1;

public class Principal21N2 {
	
	public static void main(String[] args) {
		
		boolean boolean1;
		char char1;
		
		byte num1=Entrada.llegirByte ("Introduce un número del tipo byte.");
		int num2=Entrada.llegirInt ("Introduce un número del tipo int.");
		float num3=Entrada.llegirFloat ("Introduce un número del tipo float.");
		double num4=Entrada.llegirDouble ("Introduce un número del tipo double.");
		String string1=Entrada.llegirString("Introduce un string.");
		
		do {
			char1=Entrada.llegirChar("Introduce un caracter.");
			boolean1=Entrada.llegirSiNo("Era el caracter que querías introducir? "
					+ "Escribe s si quieres volver a escribir el caracter, escribe n si quieres finalizar.");
		}while(boolean1);

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(string1);
		System.out.println(char1);
		System.out.println(boolean1);
	}
}
