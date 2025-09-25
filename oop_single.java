
//single inheritance(one level of inheritance - oner super class to one drived class

//super class
class animal{
	void leg() {
	System.out.println("this animal has 4 legs");
	}
}
//derived class
class dog extends animal{
	void bark() {
		System.out.println("this dog can bark");
	}
}
public class oop_single {
      public static void main(String[] args) {
    	  dog ob = new dog();
    	  ob.bark();
    	  ob.leg();
    	  
      }
}
