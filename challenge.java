/* //challege 1
import java.util.Scanner;
class code_challenge {
   public static void main(String[] args) {
     Scanner ob = new Scanner(System.in);
     int mark=ob.nextInt();
     
     if(mark>=35){
        System.out.println("pass");
     }
     else{
        System.out.println("fail");
     }
     ob.close();
   } 
}
 */

 //challenge 2
 class challenge {
   public static void main(String[] args){
      int num=20;
      if (num%3==0 && num%5==0 ){
        System.out.println("the num can be devisible by both");
    }
    else{
        System.out.println("the num cannot divisible by both");
    }
   }}

