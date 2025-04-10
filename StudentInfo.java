
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting basic info
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // to consume leftover newline

        System.out.print("Enter your college name: ");
        String college = sc.nextLine();

        System.out.print("Enter your department: ");
        String department = sc.nextLine();

        // Getting marks
        System.out.print("Enter marks for Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int mark3 = sc.nextInt();

        // Calculating
        int total = mark1 + mark2 + mark3;
        float average = total / 3.0f;

        // Displaying result
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("Department: " + department);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

