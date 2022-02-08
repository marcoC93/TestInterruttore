import java.util.ArrayList;

public class Lampadina  {

	int rotta = 0 ;
	String stato = "s" ;
	
	//Getters & Setters

	public int getRotta() {
		return rotta;
	}



	public void setRotta(int rotta) {
		this.rotta = rotta;
	}



	public String getStato() {
		return stato;
	}



	public void setStato(String stato) {
		this.stato = stato;
	}

	

	//definire i metodi click() e stato()



	public String stato() {
		if (stato.equals("s")) {

			System.out.println("La lampadina ora é spenta" );
			return stato ;
		}
		else if (stato.equals("a")) {

			System.out.println("la lampadina é accesa" );
			return stato ;
		}
		else 
			System.out.println("Lampadina rotta" );

		return stato ;	

	}





}