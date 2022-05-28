package Nivell_2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

	static Scanner sc=new Scanner(System.in);

	public Entrada() {
	}
	
	public static byte llegirByte (String missatge){

		byte byteNum=0;
		long num;
		boolean okNum=false;
		
		System.out.println(missatge);
		
		String input=sc.nextLine();
		
		while (!okNum) {
			
			if(input.matches("\\d*")) {
				
				num=Long.parseLong(input);
				
				if((num>-129&&num<128)) {
					
					okNum=true;
				}
				else {
					
					System.out.println("Fuera de rango. Tienes que escribir un número entero entre -128 y 127.");
					System.out.println(missatge);
					input = sc.nextLine();
				}
			}
			else {
				
				System.out.println("Error de formato. Tienes que escribir un número entero entre -128 y 127.");
				System.out.println(missatge);
				input = sc.nextLine();
			}
		}
		byteNum=Byte.parseByte(input);
		return byteNum;
		
		/*byte num;
		
		do{
			try {
				System.out.println(missatge);
				num=sc.nextByte();
				break;
			}

			catch (InputMismatchException e){
				
				System.out.println("Error de formato. Escribe un número entero entre -128 y 127.");
				
				sc.nextLine();
			}
		}while(true);
		
		
		
		return num;*/
		}
	
	public static int llegirInt(String missatge){
		
		int intNum=0;
		long num;
		boolean okNum=false;
		
		System.out.println(missatge);
		
		String input=sc.nextLine();
		
		while (!okNum) {
			
			if(input.matches("\\d*")) {
				
				num=Long.parseLong(input);
				
				if((num>-2147483649L&&num<2147483648L)) {
					
					okNum=true;
				}
				else {
					
					System.out.println("Fuera de rango. Tienes que escribir un número entero entre -2147483648 y 2147483647.");
					System.out.println(missatge);
					input = sc.nextLine();
				}
			}
			else {
				
				System.out.println("Error de formato. Tienes que escribir un número entero entre -2147483648 y 2147483647.");
				System.out.println(missatge);
				input = sc.nextLine();
			}
		}
		intNum=Integer.parseInt(input);
		
		return intNum;
	}
	
	public static float llegirFloat(String missatge) throws InputMismatchException{
		
		float num=0;
		boolean okNum=false;
		
		System.out.println(missatge);
		
		String input=sc.nextLine();
		
		while (!okNum) {
			

			
			if(input.matches("^[+-]?([0-9]+([,][0-9]*)?|[,][0-9]+)$")) {
				
				String newInput=input.replace(",", ".");
				num=Float.parseFloat(newInput);
				
				if((num>=-3.402823e38&&num<=3.402823e38)) {
					
					okNum=true;
				}
				else {
					
					System.out.println("Fuera de rango. Tienes que escribir un número decimal entre -3.402823e38 y 3.402823e38.");
					System.out.println(missatge);
					input = sc.nextLine();
				}
			}
			else {
				
				System.out.println("Error de formato. Tienes que escribir un número decimal entre -3.402823e38 y 3.402823e38.");
				System.out.println(missatge);
				input = sc.nextLine();
			}
		}

		return num;
	}
	
	public static double llegirDouble(String missatge) throws InputMismatchException{
		
		double num=0;
		boolean okNum=false;
		
		System.out.println(missatge);
		
		String input=sc.nextLine();
		
		while (!okNum) {
			
			if(input.matches("^[+-]?([0-9]+([,][0-9]*)?|[,][0-9]+)$")){
				
				String newInput=input.replace(",", ".");
				num=Double.parseDouble(newInput);
				
				if((num>=-1.79769313486231e308&&num<=1.79769313486231e308)) {
					
					okNum=true;
				}
				else {
					
					System.out.println("Fuera de rango. Tienes que escribir un número decimal entre -1.79769313486231e308 y 1.79769313486231e308.");
					System.out.println(missatge);
					input = sc.nextLine();
				}
			}
			else {
				
				System.out.println("Error de formato. Tienes que escribir un número decimal entre -1.79769313486231e308 y 1.79769313486231e308.");
				System.out.println(missatge);
				input = sc.nextLine();
			}
		}

		return num;
	}
	
	public static char llegirChar(String missatge) {
		
		char character;
		String string;
		
		System.out.println(missatge);
		string=sc.nextLine();
		character=string.charAt(0);
		
		if(string.length()>1) {
			
			System.out.println("Has introducido más de un caracter, solo se tomará el primero que has introducido.");
		}
		
		return character;
	}
	
	public static String llegirString(String missatge){
		
		String string;
		
		System.out.println(missatge);
		string=sc.nextLine();
		
		return string;
	}

	public static boolean llegirSiNo(String missatge) {
		
		boolean okNum=false;
		boolean result=false;
		
		System.out.println(missatge);
		String input=sc.nextLine();
		
		while (!okNum) {
			
			if(input.equalsIgnoreCase("s")) {
				
				okNum=true;
				result=true;
			}
			else if(input.equalsIgnoreCase("n")) {
					
				okNum=true;
				result=false;
	
			}
			else {
				
				System.out.println("Escribe s si quieres volver a escribir el caracter, escribe n si quieres finalizar.");
				System.out.println(missatge);
				input = sc.nextLine();
			}
		}
		return result;
	}
}
