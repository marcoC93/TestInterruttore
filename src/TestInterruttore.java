
public class TestInterruttore {

	public static void main(String[] args) {
	
		Interruttore interruttore1 = new Interruttore();
		Interruttore interruttore2 = new Interruttore();
		Lampadina lampadina1 = new Lampadina() ;
		
		
		interruttore1.lampadineCollegate.add(lampadina1);
		interruttore2.lampadineCollegate.add(lampadina1);
		
		
		
		
//		interruttore1.click();
		
		witchInterruttore() ;
		interruttore1.switchInterruttore(interruttore1);
		
		interruttore1.switchInterruttore(interruttore1);
	}

}
