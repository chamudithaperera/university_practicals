abstract class Person {
    protected String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public abstract String getRole();
    
    public String getName() {
        return name;
    }
}

class Student extends Person {
    private int rollNumber;
    private int[] marks;
    
    public Student(String name, int rollNumber, int[] marks) {
        super(name);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public int[] getMarks() {
        return marks;
    }
    
    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    
    @Override
    public String getRole() {
        return "Student";
    }
}

class Teacher extends Person {
    private String subject;
    
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
    
    public String getSubject() {
        return subject;
    }
    
    @Override
    public String getRole() {
        return "Teacher";
    }
}

public class Main1 {
    public static void main(String[] args) {
        int[] studentMarks = {85, 90, 78, 92, 88};
        Student student = new Student("John Doe", 12345, studentMarks);
        
        Teacher teacher = new Teacher("Jane Smith", "Mathematics");
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Role: " + student.getRole());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Average Marks: " + student.calculateAverage());
        
        System.out.println();
        
        System.out.println("Teacher Name: " + teacher.getName());
        System.out.println("Role: " + teacher.getRole());
        System.out.println("Subject: " + teacher.getSubject());
    }
}