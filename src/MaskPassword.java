import java.io.Console;
import java.util.Arrays;

public class MaskPassword {
    public static void main(String[] args) {
        Console console = System.console() ;

        char [] password = console.readPassword("Enter password: ");
        System.out.println("Password was: " + Arrays.toString(password));
        Arrays.fill(password,' ');
    }
}
