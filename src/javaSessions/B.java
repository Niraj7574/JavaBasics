package javaSessions;

public class B extends A {

	public B() {
		super(10); // To call the parent class constructor, if you do not write super it will by
					// default call default parent class constructor
		System.out.println("Child class constructor");
	}

	public static void main(String args[]) {
		B obj = new B();
	}
}
