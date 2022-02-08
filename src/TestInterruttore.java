/* Scrivere la classe Interruttore i cui oggetti rappresentano degli interruttori. Ogni interruttore `e collegato a una lampadina (oggetto della classe Lampadina) e ne regola l’accensione e spegnimento. La classe deve contenere tutte le variabili d’istanza i costruttori e i metodi ritenuti opportuni.
Per testare la classe, scrivere un programma TestInterruttore che crea due interruttori (oggetti
della classe Interruttore) entrambi collegati alla stessa lampadina (uno stesso oggetto della classe
Lampadina) e poi, in maniera iterativa, offre all’utente la possibilit`a di agire su uno dei due interruttori
(visualizzando l’esito dell’operazione) o di terminare l’esecuzione. */


public class TestInterruttore {

	public static void main(String[] args) {
	
		Interruttore interruttore1 = new Interruttore();
		Interruttore interruttore2 = new Interruttore();
		Lampadina lampadina1 = new Lampadina() ;
		
		
		interruttore1.lampadineCollegate.add(lampadina1);
		interruttore2.lampadineCollegate.add(lampadina1);
		
		
		
		
//		interruttore1.click();
		
		interruttore1.switchInterruttore(interruttore1);
		
		interruttore1.switchInterruttore(interruttore1);
	}

}
