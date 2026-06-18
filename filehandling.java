import java.io.*;
import java.util.*;

public class FileHandlingUtility {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        // Writing into file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello Gowtham!\n");
            writer.write("Welcome to CODETECH Internship.\n");
            writer.close();
            System.out.println("Data written successfully.\n");
        }
        catch(IOException e) {
            System.out.println("Error while writing file.");
        }

        // Reading file
        System.out.println("Reading File:\n");

        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
        }
        catch(Exception e) {
            System.out.println("Error while reading file.");
        }

        // Modifying file
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("This line is added later.\n");
            writer.close();

            System.out.println("\nFile modified successfully.");
        }
        catch(IOException e) {
            System.out.println("Error while modifying file.");
        }
    }
}
