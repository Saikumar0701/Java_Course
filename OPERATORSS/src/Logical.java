import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;int b=11;
        System.out.println((a<b) && (a<b));
        System.out.println((a>b)|| (a<b));
        System.out.println((a<b) != (a>b));
    }
}
