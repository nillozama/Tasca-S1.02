package Nivell_1_1;
import java.util.Scanner;

public class PrincipalS01T02N01E01 {
	
	static Venda venda=new Venda();

	public static void main(String[] args) {
		
		boolean sortirMenu=false;
			
			do{
				sortirMenu=showMenu(sortirMenu);
				
			}while(!sortirMenu);
	}
	
	public static boolean showMenu(boolean sortirMenu) {

		Producte producte;
		String name;
		byte indexSwitch;
		float price;
		float totalAPagar;
		
		System.out.println("Programa per a gestionar les comandes.\n \n0- Sortir del programa. \n1- Introduir producte. "
				+ "\n2- Pagar. \n3- Genera excepció del tipus ArrayOutOfBoundsException.");
		indexSwitch=requireByteNumber("Quina opció del menú vols triar?");
		
		switch(indexSwitch) {
		
			case 0:

				System.out.println("Gracies per utilitzar l'aplicació. Adeu!!");
				sortirMenu=true;

				break;
			
			case 1:
			
				name=requireString("Introdueix nom del producte.");
				price=requireFloatNumber("Introdueix preu del producte.");
			
				producte=crearProducte(name, price);
				venda.afegirProducte(producte);
			
				break;
			
			case 2:

				try {
					
					totalAPagar=venda.calcularTotal();
					System.out.println("Total a pagar: "+totalAPagar);
				}
				catch (VendaBuidaException vendaException){

					System.out.println(vendaException.getMessage());
				}

				break;
				
			case 3:
				
				try {
					generaExcepcio("Aquesta es una excepció ArrayIndexOutOfBoundsException");
					
				}
				catch (ArrayIndexOutOfBoundsException e) {
					
					System.out.println(e.getMessage());
				}
				
				break;

			default:
				
				System.out.println("Has d'escollir un número de la llista.");
			}
			
			return sortirMenu;
		}
		
		public static Producte crearProducte(String name, float price) {
			
			Producte producte=new Producte(name, price);

			return producte;
		}
		
		public static void generaExcepcio(String message) {
			
			throw new ArrayIndexOutOfBoundsException(message);
		}
		
		public static String requireString(String message) {
			
			Scanner sc=new Scanner(System.in);
			String string;
			
			System.out.println(message);
			string=sc.nextLine();
			
			return string;
		}
		
		public static byte requireByteNumber(String message) {
			
			Scanner sc=new Scanner(System.in);
			byte num;
			
			System.out.println(message);
			num=sc.nextByte();
			
			return num;
		}
		
		public static float requireFloatNumber(String message) {
			
			Scanner sc=new Scanner(System.in);
			float num;
			
			System.out.println(message);
			num=sc.nextFloat();
			
			return num;
		}
}
