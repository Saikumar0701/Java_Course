import java.util.Scanner;

public class Unary {
    public static void main(String[]arguments){
        Scanner sc=new Scanner(System.in);
        //--PREORDER
        int a=10;        //1)VALUE CHANGE
        int b=--a;       //2)VALUE USE
        System.out.println(a);
        System.out.println(b);


//       // ++PREORDER
//        int a=10;       //1)VALUE CHANGE
//        int b=++a;      //2)VALUE USE
//        System.out.println(a);
//        System.out.println(b);
//
//
//        //--POSTORDER
//        int a=10;           //1)VALUE USE
//        int b=a++;          //2)VALUE CHANGE
//        System.out.println(a);
//        System.out.println(b);
//
//        //++POSTORDER
//        int a=10;           //1)VALUE USE
//        int b=a--;          //2) VALUE CHANGE
//        System.out.println(a);
//        System.out.println(b);
    }
}
