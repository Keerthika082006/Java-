
//hirarichal - one parent class has 2 child class
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


public class oop_hirarichal {

	public static void main(String[] args) {
		cat obb = new cat();
		obb.eat();

	}

}
