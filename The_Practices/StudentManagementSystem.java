import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StudentManagementSystem {
    static Student[] students = new Student[100];
    static int count = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void addStudent() {
        if (count >= students.length) {
            System.out.println("Student list is full!");
            return;
        }
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        students[count++] = new Student(id, name, age);
        System.out.println("Student added successfully!");
    }

    public static void displayStudents() {
        if (count == 0) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("\nStudent List:");
        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + students[i].id + ", Name: " + students[i].name + ", Age: " + students[i].age);
        }
    }

    public static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < count; i++) {
            if (students[i].id == id) {
                System.out.print("Enter New Name: ");
                students[i].name = scanner.nextLine();
                System.out.print("Enter New Age: ");
                students[i].age = scanner.nextInt();
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            if (students[i].id == id) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
