
import java.util.Scanner;

public class Task10_PersonCharacteristics {

    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        String firstname;
        String lname;
        short date;
        short weight;
        short  height;
        String profession;

        // Allows a person to enter his first name
        System.out.print("Enter first name: " );
        firstname = one.next();

        // Allows a person to enter his last name
        System.out.print("Enter last name: " );
        lname = one.next();

        // Allows a person to enter his date of birth
        System.out.print("Enter date of birth: " );
        date = one.nextShort();

        // Allows a person to enter his weight
        System.out.print("Enter weight: " );
        weight = one.nextShort();

        // Allows a person to enter his height
        System.out.print("Enter height: " );
        height = one.nextShort();

        // Allows a person to enter his profession
        System.out.print("Enter profession: " );
        profession = one.next();

        System.out.print(firstname);
        System.out.print(" ");
        System.out.print(lname);
        System.out.print(" is born ");
        System.out.print(date);
        System.out.print(" year.");
        System.out.print(" His weight is ");
        System.out.print(weight);
        System.out.print(" kg");
        System.out.print(" and he is ");
        System.out.print(height);
        System.out.print(" cm tall.");
        System.out.print(" Hi is a ");
        System.out.print( profession);
        System.out.println(".");

    }
}

