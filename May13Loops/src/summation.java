import java.util.Scanner;

public class summation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=1;
        int sum=0;
        while(a<=10){
            sum=sum+a;
            a++;
        }
        System.out.println("sum = "+sum);
    }
}
