package day5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Step 1: Define the interface
interface Attendance {
    void addStudent(String name);
    void markAttendance();
    void showAttendance();
}

// Step 2: Implement the interface
class AttendanceManager implements Attendance {
    private ArrayList<String> students = new ArrayList<>();
    private HashMap<String, String> attendance = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addStudent(String name) {
        students.add(name);
    }

    @Override
    public void markAttendance() {
        System.out.println("\nMark attendance (P for Present, A for Absent):");
        for (String name : students) {
            System.out.print(name + ": ");
            String status = scanner.nextLine().trim().toUpperCase();
            if (!status.equals("P") && !status.equals("A")) {
                status = "A"; // default to Absent
            }
            attendance.put(name, status);
        }
    }

    @Override
    public void showAttendance() {
        System.out.println("\n--- Attendance Report ---");
        for (String name : students) {
            String status = attendance.get(name);
            System.out.println(name + ": " + (status.equals("P") ? "Present" : "Absent"));
        }
    }
}

// Step 3: Use the interface in the main program
public class Attendancesinterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendanceManager manager = new AttendanceManager();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            manager.addStudent(name);
        }

        manager.markAttendance();
        manager.showAttendance();

        scanner.close();
    }
}

