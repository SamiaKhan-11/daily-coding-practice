//Create a really simple program to demonstrate the use of a HashMap in Java.
import java.util.HashMap;
import java.util.Map;
public class hashmap {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Add some students and their grades to the HashMap
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Diana", 90);

        // Retrieve and print a student's grade
        String studentName = "Bob";
        if (studentGrades.containsKey(studentName)) {
            int grade = studentGrades.get(studentName);
            System.out.println(studentName + "'s grade: " + grade);
        } else {
            System.out.println(studentName + " not found in the HashMap.");
        }

        // Print all students and their grades
        System.out.println("\nAll students and their grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}