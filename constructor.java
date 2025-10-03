public class constructor {
    
	int marks;
	String name;
	
	//creating constructor
	constructor(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		constructor ob = new constructor();
		constructor ob1 = new constructor();	
		System.out.println(ob.marks);
		System.out.println(ob1.marks);

		
	}

}
