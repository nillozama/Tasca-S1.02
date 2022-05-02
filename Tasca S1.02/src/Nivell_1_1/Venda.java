package Nivell_1_1;
import java.util.ArrayList;

public class Venda {
	
	ArrayList<Producte> llistaProductes;
	private float preuTotalVenda;
	
	public Venda() {
		llistaProductes=new ArrayList <Producte>();
		preuTotalVenda=0;
	}
	
	public float calcularTotal() throws VendaBuidaException{
			
		if(llistaProductes.size()==0) {
			
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
		}
		else {
			
			for(int i=0; i<llistaProductes.size(); i++) {
				
				preuTotalVenda+=llistaProductes.get(i).getPreu();
			}
		}
	
		return preuTotalVenda;
	}
	
	public void afegirProducte(Producte producte) {
		
		llistaProductes.add(producte);
		System.out.println("Se ha añadido "+ producte.getNom());
		System.out.println(llistaProductes);
	}
}
