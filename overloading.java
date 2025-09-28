//nethod overloading = function name is same but the parameter should be different
public class overloading {
    void keerthi(String name){
        System.out.println(name);
    }

    void keerthi(int a,int b){
        System.out.println("add: " + a+b);
    }
    
    public static void main(String[] args) {
        overloading ob1 = new overloading();
        ob1.keerthi("akilan");
        ob1.keerthi(4,2);
    }
}
