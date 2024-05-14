import java.util.Scanner;

public class resversenumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int N=10899;
        while(N>0){
            int lastdigit=N%10;
            System.out.print(lastdigit + " ");
            N=N/10;
        }
    }
}
