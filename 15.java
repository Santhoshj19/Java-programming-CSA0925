class Student {
    String name;
    int regNumber;
    int[] subjectMarks = new int[5];
    
    public void setStudentDetails(String name, int regNumber, int[] marks) {
        this.name = name;
        this.regNumber = regNumber;
        this.subjectMarks = marks;
    }
    
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + regNumber);
        System.out.println("Subject Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
    }
    
    private int calculateTotal() {
        int total = 0;
        for (int mark : subjectMarks) {
            total += mark;
        }
        return total;
    }
    
    private double calculateAverage() {
        return calculateTotal() / 5.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        int[] marks = {80, 85, 75, 90, 88}; // Sample marks
        student.setStudentDetails("John", 123456, marks);
        student.displayDetails();
    }
}
