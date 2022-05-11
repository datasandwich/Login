import java.io.FileNotFoundException;
import java.util.Scanner;

public class Registration {
    public static void main() throws FileNotFoundException {
        {
            System.out.println("registration");
            Scanner scan = new Scanner(System.in);
            System.out.println("New username: ");
            Access.username = scan.nextLine();
            //user.password = PasswordField.readPassword("Enter password: ");
            System.out.println("New password: ");
            Access.password = MaskPassword.main();
            Welcome.main();

        }
    }
}
