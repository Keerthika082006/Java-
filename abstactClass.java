//abstract means- showing only essitionla features and hididng the interal details  
abstract class college{
   abstract void fee();

   void dep(){
    System.out.println(" College Management");//unnesary so it hides it the main thing is fee so it is abstarct 
   }
}

class rcas extends college{
    
    void fee(){
        System.out.println("fee is compelsary");
    }
    void arts(){
        System.out.println("bsc");
    }}


class rtc extends rcas{
    
    void fee(){
        System.out.println("fee is maditory");
    }
    void engee(){
        System.out.println("BE");
    }}

public class abstactClass {
        public static void main(String[] args) {
        rtc ob = new rtc();
        ob.fee();
        ob.arts();
            
         }
}