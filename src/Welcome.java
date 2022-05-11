import java.io.FileNotFoundException;
import java.util.Scanner;

public class Welcome {
    public static void main() throws FileNotFoundException {

            Scanner scan = new Scanner(System.in);
            System.out.println("Choose an option:\nLogin\nRegister\nLeave");
            String input = scan.nextLine().toLowerCase();
            if (input.equals("login")){
                Login.main();
            } else if (input.equals("register")) {
                Registration.main();
            } else {System.exit(0);}

    }
}
