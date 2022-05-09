/*
Maybe use an Array or ArrayList to store multiple username-password pairs
Create new class for user instantiation?
Create new class for user info storage?
*/

import java.util.Scanner;

public class Access {
    String username;
    String password;
    public static void welcome(Access user){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an option:\nLogin\nRegister\nLeave");
        String input = scan.nextLine().toLowerCase();
        if (input.equals("login")){
            login(user);
        } else if (input.equals("register")) {
            registration(user);
        } else {System.exit(0);}
    }
    public static void registration(Access user){
        System.out.println("registration");
        Scanner scan = new Scanner(System.in);
        System.out.println("New username: ");
        user.username = scan.nextLine();
        //user.password = PasswordField.readPassword("Enter password: ");
        System.out.println("New password: ");
        user.password = scan.nextLine();
        welcome(user);
    }
    public static void login(Access user){
        // Declare scanner
        Scanner scan = new Scanner(System.in);
        // Declare correct credentials
        // String username = "admin";
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
            if (userName.equals(user.username) && passWord.equals(user.password)) {
                i = 3;
                System.out.println("Welcome back " + userName + "!");
                System.out.println("Time has passed.");
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

            welcome(user);
        }
    }
    public static void main(String[] args) {
        Access new_user = new Access();
        welcome(new_user);




    }
}