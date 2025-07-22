package entityclassassignment1;
import java.util.Scanner;
public class StudentMain {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            students[i] = new Student(rollNumber, name, age);
        }

        scanner.close();

        System.out.println("\nCollected Student Details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
