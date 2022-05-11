import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeaderBoard {

    public static void New(int score) {
        try {
            FileWriter myWriter = new FileWriter("leaderboard.txt");
            myWriter.write("Top Scorers:"+"\nUsername: "+Access.username+"\nScore: "+score);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void Overwrite(int score){
        try {
            File f = new File("leaderboard.txt");
            System.out.println("Starting first reader");
            Scanner myReader = new Scanner(f);
            ArrayList<String> leaderboard = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //System.out.println(data);
                leaderboard.add("\n"+data);
            }
            myReader.close();

            leaderboard.add("\nUsername: "+Access.username+"\nScore: "+score);
            FileWriter myWriter = new FileWriter("leaderboard.txt");
            myWriter.write(String.valueOf(leaderboard));
            //myWriter.write();
            myWriter.close();


            System.out.println("Starting second reader");
            Scanner mySecondReader = new Scanner(f);
            while (mySecondReader.hasNextLine()) {
                String data = mySecondReader.nextLine();
                System.out.println(data);
                //myWriter.write(data+"\n"+Access.username);
            }
            mySecondReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

