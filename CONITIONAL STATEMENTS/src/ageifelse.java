import java.util.Scanner;

public class ageifelse {
    public static void main(String [] arguments){
        Scanner sc=new Scanner(System.in);
        int age;
        age= sc.nextInt();
        if(age>=18){
            System.out.println("drive,adult,vote");
        }
        if(age>=16 && age <18){
            System.out.println("Teenger");
        }
        else{
            System.out.println("not drive,not adult");
        }

    }
}
