/* class code_challenge2 {
    public static void main(String[] args){
        int m1=57;
        int m2=79;
        int m3=98;
        int m4=87;
        int m5=90;
        int avg=m1+m2+m3+m4+m5/5;
        System.out.println("average is: " + avg);

        if(avg<35){
            System.out.println("additional class required");
        }
        else{
            System.out.println("you are good");
        }
    }} */

class challenge2 {
    public static void main(String[] args){
        //String trafficLight="red";
        String trafficLight=new String("red");
        
        if(trafficLight.equals("red")){
            System.out.println("stop");
        }
        else if(trafficLight.equals("yellow")){
            System.out.println("get ready");
        }
        else if(trafficLight.equals("green")){
            System.out.println("go");
        }
    }}