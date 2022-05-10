import java.util.Scanner;

public class Welcome {
    public static void main(Access user) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Choose an option:\nLogin\nRegister\nLeave");
            String input = scan.nextLine().toLowerCase();
            if (input.equals("login")){
                Login.main(user);
            } else if (input.equals("register")) {
                Registration.main(user);
            } else {System.exit(0);}

    }
}
