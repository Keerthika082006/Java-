/*  class if_else {
    public static void main(String[] args) {

        boolean rain=true;
        if(rain){
            System.out.println("Take an umbrella");
        }
        else{
            System.out.println("enjot the sunlight");
        }
        
    }
    
} */

//Comparision operator
import java.util.Scanner;

class if_else {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b= ob.nextInt();
        if(a==b){
            System.out.println("both are equal");
        }
        else{
            System.out.println("not equal");
        }
        ob.close();   
    }


}
