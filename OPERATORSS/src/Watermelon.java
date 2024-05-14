import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int w=Sc.nextInt();
        if(w%2==0 && w > 2 ){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
