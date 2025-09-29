class student{
  static int mark=0;

  static void display(){
    System.out.println("hello");
  }
}


public class staticMethod {
    public static void main(String[] args) {
    //student ob = new student();
    student.mark=30;
    student ob1 = new student();
    ob1.mark = 45;

    student.mark=78;//static method should be accessed by class noe with object

    System.err.println(student.mark);
    student.display();
}}
