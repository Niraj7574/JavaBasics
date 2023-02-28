package oppConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		
		System.out.println(USBank.min_bal);
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		//dynamic polimorphism
		//Child class object can be referred by parents interface reference variable
		
		USBank b =  new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
	}

}
