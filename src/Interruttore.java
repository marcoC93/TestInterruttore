import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Interruttore extends Lampadina {

	
	boolean isInterruttoreAcceso = false ;
	ArrayList<Lampadina> lampadineCollegate = new ArrayList() ;
	Scanner s = new Scanner(System.in);
	// Getter and Setters
	
	public boolean isInterruttoreAcceso() {
		return isInterruttoreAcceso;
	}

	public void setInterruttoreAcceso(boolean isInterruttoreAcceso) {
		this.isInterruttoreAcceso = isInterruttoreAcceso;
	}

	public ArrayList<Lampadina> getLampadineCollegate() {
		return lampadineCollegate;
	}

	public void setLampadineCollegate(ArrayList<Lampadina> lampadineCollegate) {
		this.lampadineCollegate = lampadineCollegate;
	}
	
	// Metodi classe Interruttore

	public void click() {

		if (rotta < 10) {
			if(stato.equals("s"))
			{
				stato = "a" ;
				this.stato();

				rotta++ ;

			}
			else 
			{
				stato = "s";
				this.stato();

				rotta++ ;
			}
		}
		else {

			stato= "r" ;
			this.stato();

		}

	}
	public void switchInterruttore(Interruttore thisInterruttore) {
		if (!thisInterruttore.isInterruttoreAcceso() )
			click();
		System.out.println(isInterruttoreAcceso);
	}
	
	public void witchInterruttore() {
		System.out.println("che interruttore vuoi azionare??");
		   s.nextInt();

		Integer indiceLampadina = Integer.valueOf(s.nextInt());
		lampadineCollegate.get(indiceLampadina);
	}
	
}
