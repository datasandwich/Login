/*
Maybe use an Array or ArrayList to store multiple username-password pairs
Create new class for user instantiation?
Create new class for user info storage?
*/


public class Access {
    /* Use this code when testing new functions to increase efficiency. Allows you to skip registration.
    String username = "admin";
    String password = "Password123!";
     */
    String username;
    String password;
    public static void main(String[] args) {
        Access new_user = new Access();
        Welcome.main(new_user);
    }
}