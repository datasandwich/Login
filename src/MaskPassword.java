import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class MaskPassword {
    public static String main() {
        Console cons;

        if((cons = System.console())!=null) {
            char[] password = cons.readPassword("Enter password: ");
            return Arrays.toString(password);



        } else {
            System.out.println("No console found...\nEnter password without masking: ");
            Scanner scan = new Scanner(System.in);
            return scan.nextLine();
        }

    }
}
