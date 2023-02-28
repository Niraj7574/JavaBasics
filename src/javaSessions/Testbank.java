package javaSessions;

public class Testbank {
	
	

	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.credit();
		
		AbstractConcept a = new HDFCBank();
		a.credit();
		a.debit();
		a.loan();
		

	}

}
