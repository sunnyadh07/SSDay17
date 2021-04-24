import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        favTVShows();
        getFavTVShows();

    }

        public static void favTVShows () {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("Model\\Favorite Tv shows-to-watch.txt"));
                Scanner scanner = new Scanner(System.in);

                bw.write("Vampire Diaries\n");
                bw.write("Friends");
                bw.close();

            } catch (IOException e) {
                System.out.println("IO Exception when writing to Tv shows-to-watch.txt" + e.getMessage());
            }

        }

        public static void getFavTVShows () {
            try {
                BufferedReader br = new BufferedReader(new FileReader("Model/Favorite Tv shows-to-watch.txt"));
                String fileData;
                while ((fileData = br.readLine()) != null) {
                    System.out.println(fileData);
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IO Exception when writing to Tv shows-to-watch.txt " + e.getMessage());
            }
        }
}

