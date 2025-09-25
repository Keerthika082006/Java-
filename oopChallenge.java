class Animal{
   String name;
   int age;
   
   void makeSound(){
      System.out.println("Animal make sound");
   }}
class dog extends Animal{
    String breed;
    //override
    void makeSound(){
        System.out.println("dog barks");
    }
    void fetch(){
        System.out.println("dog is fetching");
    }
}
class cat extends Animal{
    String color;
    //override
    void makeSound(){
        System.out.println("cat meows");
    }
    void climb(){
        System.out.println("cat is climbing");
    }
}



class oopChallenge{
    public static void main(String[] args) {
        cat ob = new cat();
        ob.name ="dog";
        //ob.breed="pomerian";
        ob.color = "white";
        ob.makeSound();        
        //ob.fetch();
        ob.climb();
        

        System.out.println(ob.name);
        System.out.println(ob.color);
    }
}