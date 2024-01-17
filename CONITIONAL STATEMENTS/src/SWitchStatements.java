import java.util.Scanner;
import java.util.SortedMap;

public class SWitchStatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Hi");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                System.out.println("Bye");
                break;
            default:
                System.out.println("You are dreamig man");
        }
    }
}
