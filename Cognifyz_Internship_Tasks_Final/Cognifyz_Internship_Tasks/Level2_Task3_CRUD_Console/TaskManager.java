import java.util.ArrayList;
import java.util.Scanner;
class Task {
    String title;
    Task(String title) { this.title = title; }
}
public class TaskManager {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add 2.View 3.Update 4.Delete 5.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    tasks.add(new Task(sc.nextLine()));
                    break;
                case 2:
                    for (int i = 0; i < tasks.size(); i++) 
                        System.out.println((i+1) + ". " + tasks.get(i).title);
                    break;
                case 3:
                    System.out.print("Task number to update: ");
                    int idx = sc.nextInt() - 1;
                    sc.nextLine();
                    if (idx >= 0 && idx < tasks.size()) {
                        System.out.print("New title: ");
                        tasks.get(idx).title = sc.nextLine();
                    }
                    break;
                case 4:
                    System.out.print("Task number to delete: ");
                    tasks.remove(sc.nextInt() - 1);
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}
