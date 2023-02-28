package oppConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();

	public void transferMoney();
	
	
	//Only method declaration
	//no method body -- only method prototype
	//In interface we can declare the variables, and variables are by default static in nature
	//Variable value can not be changed
	//No Static method in interface
	//WE can not create object of the interface
	//Interface is abstract in the nature
	//100% abstraction
	
	
}
