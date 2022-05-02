package Nivell_1_1;

public class VendaBuidaException extends Exception{

	private String message;
	
	public VendaBuidaException(String message) {
		
		this.message=message;
	}
	
	public String getMessage() {
		
		//
		return message;
	}
}
