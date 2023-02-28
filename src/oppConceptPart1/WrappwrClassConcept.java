package oppConceptPart1;

public class WrappwrClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//Data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer. Double, Character, Boolean
		//String to double
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		//String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		
		
		//Int to String conversion
		int j = 200;
		String s = String.valueOf(i);
		System.out.println(s);

		String u = "100A";
		Integer.parseInt(u);  //number format exception for input String -- 100A
		
		
	}

}
