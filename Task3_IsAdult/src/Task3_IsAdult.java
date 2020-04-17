import java.util.Scanner;

public class Task3_IsAdult {

    public static void main(String[] args) {


        Scanner one = new Scanner (System.in);
        System.out.print("Enter a number of age: ");
        int age = one.nextInt();
        boolean b = (age > 18);

        System.out.println(b);

    }
}
