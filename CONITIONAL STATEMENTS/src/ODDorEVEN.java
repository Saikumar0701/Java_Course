import java.util.Scanner;
public class ODDorEVEN {
    public static void main(String [] arguments){
        Scanner sc=new Scanner(System.in);
        int ODDOREVEN=sc.nextInt();
        if(ODDOREVEN %2 ==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}
