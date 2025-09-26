//hybrid = more then one type of inhertance
class animal{
	void eat() {
		System.out.println("this animal can eat");
	}
}
class dog extends animal{
	void bark() {
		System.out.println("dog barks");
	}
}
class cat extends animal{
	void meow() {
		System.out.println("cat meow");
	}
}
class puppy extends dog {
	void weep() {
		System.out.println("puppy weeps");
	}
}


public class oop_hybrid {

	public static void main(String[] args) {
		puppy obb = new puppy();
		obb.eat();
		obb.weep();
		obb.bark();
		

	}

}
