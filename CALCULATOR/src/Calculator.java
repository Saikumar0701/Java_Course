import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a=sc.nextInt();
        System.out.print("Enetr b : ");
        int b= sc.nextInt();
        System.out.print("Enter Operator : ");
        char Operator= sc.next().charAt(0);
        switch(Operator){
            case '+':
                System.out.println("The Sum of a+b is " + (a+b));
                break;
            case '-':
                System.out.println("The Subtract of a+b is " + (a-b));
                break;
            case '*':
                System.out.println("The Mutliple of a*b is " + (a*b));
                break;
            case '/':
                System.out.println("The divide of a/b is " + (a/b));
                break;
            case '%':
                System.out.println("The modulo of a%b is " + (a%b));
                break;
            default:
                System.out.println("Not That adavnced");
        }
    }
}
