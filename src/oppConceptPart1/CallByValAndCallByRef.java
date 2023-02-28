package oppConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x  = 10;
		int y = 20;
		obj.testSum(x, y);  //Call by value or pass by value
	
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		
		//After Swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	

	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	
	//CAll by Reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p;   //temp = 50
		t.p = t.q;   //t.p = 60
		t.q = temp;  //t.q = 50
		
	}
	

}
