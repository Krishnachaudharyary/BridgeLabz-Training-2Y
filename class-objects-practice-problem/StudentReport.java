class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F'; // Fail
        }
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        // Example student objects
        Student s1 = new Student("Krishna", 101, 88.5);
        Student s2 = new Student("Aarav", 102, 59.0);
        Student s3 = new Student("Meera", 103, 35.0);

        // Display reports
        s1.displayDetails();
        System.out.println("------------------------");
        s2.displayDetails();
        System.out.println("------------------------");
        s3.displayDetails();
    }
}
