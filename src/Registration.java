import java.util.Scanner;

public class Registration {
    public static void main(Access user) {
        {
            System.out.println("registration");
            Scanner scan = new Scanner(System.in);
            System.out.println("New username: ");
            user.username = scan.nextLine();
            //user.password = PasswordField.readPassword("Enter password: ");
            System.out.println("New password: ");
            user.password = MaskPassword.main();
            Welcome.main(user);

        }
    }
}
