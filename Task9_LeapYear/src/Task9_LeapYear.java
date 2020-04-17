import java.util.Scanner;

public class Task9_LeapYear {

    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        System.out.print("Enter year: ");

        short year = one.nextShort();

        boolean a = ( year % 4 == 0 ) && ( year % 100 != 0);
        a = a || (year % 400 == 0);
        System.out.println( year + " year is a leap year: " + a );



    }
}
