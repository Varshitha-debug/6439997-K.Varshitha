import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample22 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileWriter writer = new FileWriter("output.txt")) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            writer.write(input);
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
