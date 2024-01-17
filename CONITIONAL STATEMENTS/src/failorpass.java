import java.util.Scanner;
public class failorpass {
    // Uisng Tenary Operator
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();

        String rc=((marks>=33) ? "Pass" : "Fail");
        System.out.println(rc);




    }
}
