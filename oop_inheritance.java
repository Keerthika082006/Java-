//inheritance means can access properties in another class in same file


class dad{
	int money = 300000;
}

class daughter extends dad{
    String car = "porsha";	
}



public class oop_inheritance {

	public static void main(String[] args) {
		daughter ob = new daughter();
		System.out.println(ob.car);

	}

}
