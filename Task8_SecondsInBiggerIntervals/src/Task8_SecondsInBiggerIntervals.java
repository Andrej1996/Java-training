import java.util.Scanner;

public class Task8_SecondsInBiggerIntervals {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        System.out.print("How many seconds? ");
        int n = one.nextInt();
        int D = n/86400;
        int H = (n%86400)/3600;
        int M = ((n%86400)%3600) /60;
        int S =(((n%86400)%3600)%60);

        System.out.print("That is " +D+ " days, " +H+ " hours, " +M+ " minutes and " +S+ " seconds. ");
    }
}
