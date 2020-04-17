import java.util.Scanner;

public class Task7_SwapVariables {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner one = new Scanner (System.in);
        System.out.print("Enter the x:  ");
        x = one.nextInt();
        System.out.print("Enter the y:  ");
        y = one.nextInt();

        x += (y - ( y = x ));
        System.out.println("New values of x and y are x = " + x + ", y = " + y);

    }
}
