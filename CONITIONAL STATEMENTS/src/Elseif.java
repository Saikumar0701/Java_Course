import java.util.Scanner;

public class Elseif {
    public static void main(String [] arguments){
        Scanner sc=new Scanner(System.in);
        int agee=sc.nextInt();
        if(agee >=18){
            System.out.println("Adult");
        }
        else if(agee >= 13 && agee <18){
            System.out.println("Teenager");
        }
        else System.out.println("Bot");
    }
}
