 class class_object {
    int coffee = 20;
    int tea  =  10;
    public static void main(String[] args) {

        class_object server1 = new class_object();//creating object - only with object we can access the value inside the class one class can have multiple object
        System.out.println(server1.coffee);

        class_object server2 = new class_object();
         System.out.println(server2.tea);
        
    }
}
