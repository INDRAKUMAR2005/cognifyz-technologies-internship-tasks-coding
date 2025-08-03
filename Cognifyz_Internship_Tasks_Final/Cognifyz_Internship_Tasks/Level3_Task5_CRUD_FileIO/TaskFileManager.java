import java.io.*;
import java.util.*;
public class TaskFileManager {
    static final String FILE_NAME = "tasks.txt";
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add 2.View 3.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
                writer.write(task);
                writer.newLine();
                writer.close();
            } else if (choice == 2) {
                BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            }
        } while (choice != 3);
        sc.close();
    }
}
