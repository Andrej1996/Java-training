import java.util.Scanner;

public class Task5_InchToCm {
    public static void main (String[] args){

        //1 inches = 2.54 centimeters;

        Scanner one = new Scanner (System.in);
        System.out.print("Enter the inches: ");
        float inches = one.nextFloat();
        float cm = inches * 2.54f;

        System.out.println(inches + " inches are " + cm + " centimeters.");
    }
}
