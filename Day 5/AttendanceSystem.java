package day5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();
        HashMap<String, String> attendance = new HashMap<>();

        // Add students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            students.add(name);
        }
        

        // Mark attendance
        System.out.println("\nMark attendance (P for Present, A for Absent):");
        for (String name : students) {
            System.out.print(name + ": ");
            String status = scanner.nextLine().trim().toUpperCase();
            if (!status.equals("P") && !status.equals("A")) {
                status = "A"; // Default to absent if invalid input
            }
            attendance.put(name, status);
        }

        // Display attendance report
        System.out.println("\n--- Attendance Report ---");
        for (String name : students) {
            System.out.println(name + ": " + (attendance.get(name).equals("P") ? "Present" : "Absent"));
        }

        scanner.close();
    }
}
