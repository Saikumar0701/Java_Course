import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int a;
        int b;
        int sum;
        int sub;
        int multi;
        int divide;
        int modulo;
        a=Sc.nextInt();
        b=Sc.nextInt();
        sum=a+b;
        sub=a-b;
        multi=a*b;
        divide=a/b;
        modulo=a%b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(divide);
        System.out.println(modulo);
        System.out.println(sum+sub+multi+divide+modulo);
    }
}
