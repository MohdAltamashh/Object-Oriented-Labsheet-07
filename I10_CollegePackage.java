// File: college/students/Student.java
package college.students;

public class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

// File: college/students/Main.java
package college.students;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Altamash");
        student.display();
    }
}

// Compile from project root:
// javac -d . college/students/Student.java college/students/Main.java
// Run:
// java college.students.Main
