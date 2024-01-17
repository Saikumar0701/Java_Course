import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int marks;
        marks=Sc.nextInt();
        if(marks>33){
            System.out.println("pass");
        }
        else
            System.out.println("Fail");
    }
}
