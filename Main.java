import java.util.*;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                students.add(new Student(id, name));
                System.out.println("Student added!");
            }

            else if (choice == 2) {
                for (Student s : students) {
                    System.out.println("ID: " + s.id + ", Name: " + s.name);
                }
            }

            else if (choice == 3) {
                System.out.println("Exit...");
                break;
            }

            else {
                System.out.println("Wrong choice!");
            }
        }
    }
}