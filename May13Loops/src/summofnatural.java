import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class summofnatural {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter N =");
        int N=Sc.nextInt();
        int a=1;
        int sum=0;
        while(a<=N){
            sum=sum+a;
            a++;

        }
        System.out.println("total Sum = "+ sum);
    }
}
