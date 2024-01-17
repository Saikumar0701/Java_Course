public class Largestof3 {
    public static void main(String[]args){
        int a=99;
        int b=2;
        int c=3;
        if(a>=b && a>=c){
            System.out.println("Largest is a");
        }
        else if (b>=c){
            System.out.println("Largest is b");
        }
        else System.out.println("Largest is c");
    }
}
