//super key is used to call the constructor inside the parent class
//child class run agaurathuku munadi parent class run aganumna super use panikalam
class animal {
    //constructor
    int age=5;
    animal(String name){
        System.out.println("hi im animal");
        //System.out.println("im "+ name);
    }
    void makeSound(){
        System.out.println("animal make sound");
    }
}

class dog extends animal{
    //constructor
    dog(){
       super("monkey");//to pass parameter to parent class constructor
       super.makeSound();//function also can cll using super key
       System.out.println("hello im dog");
       System.out.println(super.age);
       
    }
}



public class superKey {
    public static void main(String[] args) {
        dog ob = new dog();
        ob.makeSound();
       
        
    }
   
}
