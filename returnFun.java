/* public class returnFun {

    int phone(int price){
        int totalPrice = 25000;
        int remaining = price - totalPrice;
        return remaining;
    }

    public static void main(String[] args) {
        returnFun obb = new returnFun();
        int remaining = obb.phone(28000);
        System.out.println(remaining);
    }
    
}
 */
public class returnFun {

    String hlo(String name){
        return name;
    }

    int phone(int number){
        return number;
    }

    public static void main(String[] args) {
        returnFun obb = new returnFun();
        String output = obb.hlo("keerthika");
        System.out.println(output);

        int num = obb.phone(1234567890);
        System.out.println(num);
        
    }
    
}

