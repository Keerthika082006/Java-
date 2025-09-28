//java dont have muliple inheeritamce because of the dimond prblm so it has interface
//interface dont have construtors
//by default - public static final
interface animal{
//interface la create panura elam method default ah abstract method 
    int mark = 20;
     void sound();//interface ku object create pana mudiyathu
}

class cat implements animal{//extends ku bathula interface la implements use pnnaum
   public  void sound(){
        System.out.println("meow meow");
    }

}

public class oppInterface{
     public static void main(String[] args){
          cat c1 = new cat();
          c1.sound();
          
}}