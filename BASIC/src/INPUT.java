import java.util.Scanner;

public class INPUT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        b = sc.nextInt();
        a = sc.nextInt();
        System.out.println(a + b);

        // 1)nextInt(intput)

        int c = sc.nextInt();
        System.out.println(c);

        //next
        String d = sc.next();
        System.out.println(d);

        //nextLine
        String e = sc.nextLine();
        System.out.print(e);

        //nextByte
        int f = sc.nextByte();
        System.out.println(f);

        //nextFloat
        Float g = sc.nextFloat();
        System.out.println(g);


        //nextDouble
        Double h = sc.nextDouble();
        System.out.println(h);

        //nextBoolean
        boolean i = sc.nextBoolean();
        System.out.println(i);

        //nextShort
        short j = sc.nextShort();
        System.out.println(j);

        //nextLong
        long k = sc.nextLong();
        System.out.println(k);
    }
}
