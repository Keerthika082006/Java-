
//multilevel 
class animal{
	void eat() {
	System.out.println("this animal eats");
	}
}
//derived class
class dog extends animal {
	void bark() {
		System.out.println("dog barks");
	}
}
class puppy extends dog {
	void weep() {
		System.out.println("puppy weeps");
	}
}

public class oop_multi_inhertance {

	public static void main(String[] args) {
		puppy ob = new puppy();
		ob.weep();
		ob.bark();
		ob.eat();
		

	}

}
