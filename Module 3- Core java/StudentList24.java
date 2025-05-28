import java.util.ArrayList;
import java.util.Scanner;

public class StudentList24 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter student name (or 'exit' to stop): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            students.add(input);
        }

        System.out.println("Students:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
