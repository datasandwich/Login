
import java.util.Scanner;
// Maybe use an Array or ArrayList to store multiple username-password pairs

public class Access {
    String[][] database = new String[15][15];
    int i = 0;
    int j = 0;
    public void welcome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an option:\nLogin\nRegister\nLeave");
        String input = scan.nextLine().toLowerCase();
        if (input.equals("login")){
            login();
        } else if (input.equals("register")) {
            registration();
        } else {System.exit(0);}
    }
    public void registration(){
        User new_user = new User();
        System.out.println("registration");
        Scanner scan = new Scanner(System.in);
        System.out.println("New username");
        new_user.username = scan.nextLine();
        System.out.println("New password");
        new_user.password = scan.nextLine();
        database[i][j] = new_user.username;
        database[i][j+1] = new_user.password;
        i++;
        j++;
        welcome();
    }
    public void login(){

        // Declare scanner
        Scanner scan = new Scanner(System.in);
        // Declare correct credentials
        //String username = "admin";
        // String password = "Password123!";
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
                passWord = scan.nextLine();
            }
            // Verifying credentials

            //------------------------------// CHANGE DATABASE FROM ARRAY TO ARRAYLIST

            if (database.contains(userName) && database.contains(passWord)) {
                i = 3;
                System.out.println("Welcome back " + userName + "!");

            //-----------------------------//

            } else {
                i++;
                int attempts = 3-i;
                if (i != 3) {
                    System.out.println("Invalid credentials! " + attempts + " attempts remaining.");
                } else {
                    System.out.println("Too many failed attempts!");
                }
            }

        }
        System.out.println("Time has passed.");
        System.out.println("You've been logged out.");
        welcome();
    }
    public static void main(String[] args) {
        Access access = new Access();
        access.welcome();




    }
}