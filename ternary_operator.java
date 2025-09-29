//syntax= variab;e = (condition)? "valueTrue" : "valuefalse";

/* class ternary_operator {
    public static void main(String[] args) {
       //String result = (5>2)? "yes" : "no"; 
      
       boolean rain=false;
       String result =(rain)? "take umberlla with u" : "enjoy sunlight";
       System.out.println(result);
    }
}
 */
import java.util.Scanner;
 class ternary_operator {
    public static void main(String[] args){
    Scanner ob = new Scanner(System.in);
    System.out.print("enter a: ");
    int a = ob.nextInt();
    System.out.print("enter b: ");
    int b = ob.nextInt();

    String result=(a>b)? "a is greater" : "b is greater";
    System.out.println(result);
    ob.close();


    }}