import java.util.Scanner;


       
public class basic{
    public static void main(String[] args) {
           Scanner ob=new Scanner(System.in);

           System.out.print("enter the operator: ");
           String opp = ob.nextLine();

           System.out.print("enter the num1: ");
           int num1 = ob.nextInt(); 
           
           System.out.print("enter the num2: ");
           int num2 = ob.nextInt();

           if(opp == "+"||opp== "-"||opp== "*"){
              int sum= num1+num2;
              System.out.println(sum);
           }
           

    }}


