import java.util.Scanner;

public class Login {
    public static void main(Access user) {
            // Declare scanner
            Scanner scan = new Scanner(System.in);
            // Declare correct credentials

            int i = 0;
            while (i < 3) {
                String userName = "";
                String passWord = "";
                // Username input
                while (userName.equals("")){
                    System.out.println("Enter username: ");
                    userName = scan.nextLine().toLowerCase();
                }
                // Password input
                while (passWord.equals("")) {
                    System.out.println("Enter password: ");
                    passWord = MaskPassword.main();
                }
                // Verifying credentials
                if (userName.equals(user.username) && passWord.equals(user.password)) {
                    i = 3;
                    System.out.println("Welcome back " + userName + "!");
                    Quiz.main();
                    System.out.println("You've been logged out.");
                } else {
                    i++;
                    int attempts = 3-i;
                    if (i != 3) {
                        System.out.println("Invalid credentials! " + attempts + " attempts remaining.");
                    } else {
                        System.out.println("Too many failed attempts!");
                    }
                }

                Welcome.main(user);

        }
    }
}
